package com.brynchuk.commentsuserapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "posts")
@Data
public class Comment {
    @Id
    private int id;
    private String body;
    private int postId;
    private String username;
    private Date updatedAt;

    @JsonProperty("user")
    public void setUsername(User user) {
        String name = user.getUserName();
        username = name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
