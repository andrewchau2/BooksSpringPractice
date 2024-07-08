package com.fightbat.practice.service.Impl;

import org.springframework.stereotype.Service;

import com.fightbat.practice.repository.AuthorRepository;

@Service
public class AuthorServiceImpl {
    
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository ){
        this.authorRepository = authorRepository;
    }



}
