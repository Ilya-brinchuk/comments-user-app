package com.brynchuk.commentsuserapp;

import com.brynchuk.commentsuserapp.model.Comment;
import com.brynchuk.commentsuserapp.repository.CommentsRepository;
import com.brynchuk.commentsuserapp.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.List;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@SpringBootApplication
@RequiredArgsConstructor
public class CommentsUserAppApplication implements CommandLineRunner {
    private final CommentsRepository commentsRepository;
    private final DummyService dummyService;

    public static void main(String[] args) {
        SpringApplication.run(CommentsUserAppApplication.class, args);
    }


    @Override
    public void run(String... args) {
        List<Comment> all = commentsRepository.findAll();
        if (all.isEmpty()) {
            commentsRepository.saveAll(dummyService.getComments());
        }
    }
}
