package org.deepti.repository;

import org.deepti.model.Course;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements Repo<Course>{

    private List<Course> courses;

    @Override
    public List<Course> findAll() {

        courses = new ArrayList<>();
        Course javaCourse=new Course("OfflineCourse",1,"zth java","java complete mastery in one month");
        courses.add(javaCourse);

        return courses;

    }
}
