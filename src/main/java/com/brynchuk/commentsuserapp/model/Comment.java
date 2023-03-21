package com.comments.commentsapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comment {
    private int id;
    private String body;
    private int postId;
    private User user;
}
