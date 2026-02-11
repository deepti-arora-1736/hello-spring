package org.deepti.config;

import org.deepti.repository.CourseRepository;
import org.deepti.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CourseService getCourseService(){
        return new CourseService(getCourseRepository());
    }

    @Bean
    public CourseRepository getCourseRepository(){
        return new CourseRepository();
    }





}
