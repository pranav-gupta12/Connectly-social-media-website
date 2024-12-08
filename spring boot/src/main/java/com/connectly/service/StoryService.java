package com.connectly.service;

import java.util.List;

import com.connectly.exception.StoryException;
import com.connectly.exception.UserException;
import com.connectly.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
