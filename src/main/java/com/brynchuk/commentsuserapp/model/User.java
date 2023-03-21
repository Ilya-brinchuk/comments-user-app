package com.brynchuk.commentsuserapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private int id;
    @JsonProperty("username")
    private String userName;
}
