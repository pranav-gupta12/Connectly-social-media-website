package com.connectly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectly.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
