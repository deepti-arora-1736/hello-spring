package org.deepti.service;

import org.deepti.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService<Course> {

    private List<Course> listOfCourses;

    public CourseService(){
        listOfCourses=new ArrayList<>();
        Course course=new Course("OfflineCourse",1,"Java Starter Pack","Become zero to Hero in java");
        listOfCourses.add(course);
    }

    @Override
    public List<Course> list() {
        return listOfCourses;
    }

    @Override
    public Course create(Course course) {
      return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
