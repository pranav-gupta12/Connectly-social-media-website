package com.connectly.service;

import com.connectly.exception.CommentException;
import com.connectly.exception.PostException;
import com.connectly.exception.UserException;
import com.connectly.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
