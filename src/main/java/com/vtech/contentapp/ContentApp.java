package com.vtech.contentapp;


import com.vtech.contentapp.config.ContentCalendarProperties;
import com.vtech.contentapp.model.Content;
import com.vtech.contentapp.model.Type;
import com.vtech.contentapp.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

import static com.vtech.contentapp.model.Status.IDEA;


@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentApp {

    public static void main(String[] args) {
        SpringApplication.run(ContentApp.class, args);
    }



}











