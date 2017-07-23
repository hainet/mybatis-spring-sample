package com.hainet.mybatis.spring.sample.mapper;

import com.hainet.mybatis.spring.sample.domain.Person;

import java.util.List;

public interface PersonMapper {

    List<Person> findAll();
}
