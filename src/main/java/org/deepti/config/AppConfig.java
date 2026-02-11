package org.deepti.config;

import org.deepti.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CourseService getCourseService(){
        return new CourseService();
    }



}
