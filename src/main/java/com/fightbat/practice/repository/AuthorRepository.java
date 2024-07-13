package com.fightbat.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fightbat.practice.pojo.AuthorEntity;



@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity,String> {
    
}
