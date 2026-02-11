package org.deepti;


import org.deepti.config.AppConfig;
import org.deepti.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService courseService=context.getBean(CourseService.class);
//        CourseService cs=new CourseService();
        System.out.println(courseService.list());


    }
}