package com.fightbat.practice.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fightbat.practice.pojo.AuthorDto;
import com.fightbat.practice.pojo.AuthorEntity;

@Component
public class AuthorMapper implements ObjectMapper<AuthorDto,AuthorEntity> {
    
    private ModelMapper modelMapper;

    @Autowired
    public AuthorMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }


    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity){
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto){
        return modelMapper.map(authorDto, AuthorEntity.class);
    }

}
