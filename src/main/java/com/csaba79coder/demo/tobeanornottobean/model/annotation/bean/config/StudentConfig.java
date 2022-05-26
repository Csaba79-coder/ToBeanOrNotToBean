package com.csaba79coder.demo.tobeanornottobean.model.annotation.bean.config;

import com.csaba79coder.demo.tobeanornottobean.model.annotation.bean.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student studentBean() {
        return new Student();
    }
}
