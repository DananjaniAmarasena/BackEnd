package com.programming.techie.OnlineLibrary.service;

import com.programming.techie.OnlineLibrary.dto.JournalDto;
import com.programming.techie.OnlineLibrary.exception.JournalNotFoundException;
import com.programming.techie.OnlineLibrary.models.Journal;
import com.programming.techie.OnlineLibrary.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class JournalService {

    @Autowired
    private AuthService authService;
    @Autowired
    private JournalRepository journalRepository;

    @Transactional
    public List<JournalDto> showAllJournals(){
        List<Journal> journals = journalRepository.findAll();
        return journals.stream().map(this::mapFromJournaltoDto).collect(toList());
    }

    @Transactional
    public void createJournal(JournalDto journalDto){
        Journal journal = mapFromDtoToJournal(journalDto);
        journalRepository.save(journal);
    }

    @Transactional
    public JournalDto readSinglJournal(Long j_id) {
        Journal journal = journalRepository.findById(j_id).orElseThrow(() -> new JournalNotFoundException("For id " +j_id));
        return mapFromJournaltoDto(journal);
    }

    private JournalDto mapFromJournaltoDto(Journal journal){
        JournalDto journalDto = new JournalDto();
        journalDto.setId(journal.getId());
        journalDto.setTitle(journal.getTitle());
        journalDto.setUser_type(journal.getUser_type());
        journalDto.setContent(journal.getContent());
        return journalDto;
    }



    public Journal mapFromDtoToJournal(JournalDto journalDto){
        Journal journal = new Journal();
        journal.setTitle(journalDto.getTitle());
        journal.setUser_type(journalDto.getUser_type());
        journal.setContent(journalDto.getContent());
        com.programming.techie.OnlineLibrary.models.User loggedInUser= authService.getCurrentUser().get();
        journal.setAuthor(loggedInUser);
        return journal;


    }
}
