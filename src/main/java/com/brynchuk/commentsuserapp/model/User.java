package com.comments.commentsapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    @JsonProperty("username")
    private String userName;
}
