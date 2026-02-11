package org.deepti.repository;


import org.deepti.model.Course;

import java.util.List;

public interface Repo<T> {


    List<Course> findAll();
}
