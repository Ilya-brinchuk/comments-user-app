package com.brynchuk.commentsuserapp.repository;

import com.brynchuk.commentsuserapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment, Integer> {
}
