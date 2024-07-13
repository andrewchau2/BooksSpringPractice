package com.fightbat.practice.service;

import java.util.List;

import com.fightbat.practice.pojo.AuthorEntity;

public interface AuthorService {
    

    public AuthorEntity find(Long id);

    public List<AuthorEntity> findAll();

    public AuthorEntity create(AuthorEntity authorEntity);

    public void delete(Long id);

    public AuthorEntity update(AuthorEntity authorEntity);
}
