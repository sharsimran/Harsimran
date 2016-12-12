package com.mockii.dao;

import com.mockii.entity.UserProfile;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Billa on 12/11/16.
 */
@Transactional
public interface UserProfileDAO extends CrudRepository<UserProfile, Long> {

}