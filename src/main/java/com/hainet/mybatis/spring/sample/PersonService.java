package com.hainet.mybatis.spring.sample;

import com.hainet.mybatis.spring.sample.domain.Person;
import com.hainet.mybatis.spring.sample.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Transactional
    public List<Person> findAll() {
        return personMapper.findAll();
    }
}