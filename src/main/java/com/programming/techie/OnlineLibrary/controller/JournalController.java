package com.programming.techie.OnlineLibrary.controller;


import com.programming.techie.OnlineLibrary.dto.JournalDto;
import com.programming.techie.OnlineLibrary.service.JournalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journals")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping("/")
    public ResponseEntity<JournalDto> createJournal(@RequestBody JournalDto journalDto){
        journalService.createJournal(journalDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<JournalDto>> showAllJournals(){
        return new ResponseEntity<>(journalService.showAllJournals(), HttpStatus.OK);
    }

    @GetMapping("/get/{j_id}")
    public ResponseEntity<JournalDto> getSingleJournal(@PathVariable @RequestBody Long j_id){
        return new ResponseEntity<>(journalService.readSinglJournal(j_id),HttpStatus.OK);
    }
}
