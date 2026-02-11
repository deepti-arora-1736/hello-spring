package org.deepti.service;

//<T> represents the type - instead of creating seperate user crud service and course crud service we created this

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {

    //list of users or the courses
    List<T> list();

    //create a new user/course
    T create(T t);

    Optional<T> get(int id);

    //update a course or a user
    void update(T t, int id);

    void delete(int id);



}
