package com.brynchuk.commentsuserapp.model;

import lombok.Data;

import java.util.List;

@Data
public class Container {
    List<Comment> comments;
}
