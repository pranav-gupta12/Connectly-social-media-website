package com.connectly.service;

import java.util.List;

import com.connectly.exception.UserException;
import com.connectly.model.Reels;
import com.connectly.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
