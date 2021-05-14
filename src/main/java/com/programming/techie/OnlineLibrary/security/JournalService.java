package com.programming.techie.OnlineLibrary.security;

import com.programming.techie.OnlineLibrary.dto.JournalDto;
import com.programming.techie.OnlineLibrary.exception.JournalNotFoundException;
import com.programming.techie.OnlineLibrary.models.Journal;
import com.programming.techie.OnlineLibrary.repository.JournalRepository;
import com.programming.techie.OnlineLibrary.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
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
        journalDto.setJ_id(journal.getJ_id());
        journalDto.setJ_title(journal.getJ_title());
        journalDto.setJ_writer(journal.getJ_writer());
        journalDto.setUser_type(journal.getUser_type());
        journalDto.setContent(journal.getContent());
        return journalDto;
    }



    public Journal mapFromDtoToJournal(JournalDto journalDto){
        Journal journal = new Journal();
        journal.setJ_title(journalDto.getJ_title());
        journal.setJ_writer(journalDto.getJ_writer());
        journal.setUser_type(journalDto.getUser_type());
        journal.setContent(journalDto.getContent());
        User loggedInUser=  authService.getCurrentUser().orElseThrow(()->new IllegalArgumentException("No User Logged in"));
        journal.setUser_type(loggedInUser.getUsername());
        return journal;


    }
}
