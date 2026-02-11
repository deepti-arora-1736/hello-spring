package org.deepti;


import org.deepti.service.CourseService;

public class Main {
    public static void main(String[] args) {

        CourseService cs=new CourseService();

        System.out.println(cs.list());


    }
}