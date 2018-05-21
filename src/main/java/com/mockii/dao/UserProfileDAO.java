package com.mockii.dao;

import com.mockii.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Chouhan on 12/11/16.
 */
@Transactional
public interface UserProfileDAO extends JpaRepository<UserProfile, Long> {

}