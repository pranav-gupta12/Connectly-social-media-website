package com.connectly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectly.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
