package com.brynchuk.commentsuserapp.service;

import com.brynchuk.commentsuserapp.model.Comment;
import com.brynchuk.commentsuserapp.model.Container;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DummyService {
    private final RestTemplate restTemplate;
    public List<Comment> getComments(){
        Container container = restTemplate.getForEntity("https://dummyjson.com/comments", Container.class).getBody();

        List<Comment> comments = null;
        if (container != null) {
            comments = container.getComments();
            comments.forEach(comment -> comment.setUpdatedAt(new Date()));
        }
        return comments;
    }
}
