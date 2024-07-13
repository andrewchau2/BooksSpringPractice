package com.fightbat.practice.mapper;

public interface ObjectMapper<A,B> {
    
    public A mapTo(B b);

    public B mapFrom(A a);
}
