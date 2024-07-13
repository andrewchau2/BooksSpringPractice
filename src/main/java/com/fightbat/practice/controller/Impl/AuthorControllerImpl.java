package com.fightbat.practice.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fightbat.practice.mapper.AuthorMapper;
import com.fightbat.practice.pojo.AuthorDto;
import com.fightbat.practice.pojo.AuthorEntity;
import com.fightbat.practice.service.AuthorService;

@RestController
public class AuthorControllerImpl {
    
    private AuthorService authorService;
    private AuthorMapper authorMapper;

    @Autowired
    public AuthorControllerImpl(AuthorService authorService, AuthorMapper authorMapper){
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping(path = "/authors")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto author) {
        AuthorEntity authorEntity = authorMapper.mapFrom(author);
        AuthorEntity savedAuthorEntity = authorService.create(authorEntity);
        return new ResponseEntity<>(authorMapper.mapTo(savedAuthorEntity), HttpStatus.CREATED);
    }


    @GetMapping(path = "/authors")
    public String findAllAuthors(){
        return "Hello";
    }
}
