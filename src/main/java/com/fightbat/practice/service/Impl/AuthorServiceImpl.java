package com.fightbat.practice.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fightbat.practice.pojo.AuthorEntity;
import com.fightbat.practice.repository.AuthorRepository;
import com.fightbat.practice.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
    
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository ){
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity find(Long authorId){
        Optional<AuthorEntity> res = authorRepository.findById(authorId.toString());
        return res.isPresent() ? res.get() : null;
    }

    @Override
    public List<AuthorEntity> findAll(){
        return authorRepository.findAll();
    }

    @Override
    public AuthorEntity create(AuthorEntity authorEntity){
        return authorRepository.save(authorEntity);
    }

    @Override
    public void delete(Long id){
        authorRepository.deleteById(id.toString());
    }

    @Override
    public AuthorEntity update(AuthorEntity authorEntity){
        return authorRepository.save(authorEntity);
    }

}
 