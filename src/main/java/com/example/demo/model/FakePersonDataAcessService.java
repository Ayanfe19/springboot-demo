package com.example.demo.model;

import com.example.demo.dao.PersonDao;

import java.util.ArrayList;

public class FakePersonDataAcessService implements PersonDao {
    private static list<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
