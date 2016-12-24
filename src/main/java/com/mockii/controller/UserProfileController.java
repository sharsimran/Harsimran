package com.mockii.controller;

import com.mockii.dao.UserProfileDAO;
import com.mockii.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Billa on 12/12/16.
 */
@RestController(value = "/user")
public class UserProfileController {
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    @ResponseBody
    public String create(UserProfile user) {
        try {
            user.setCreatedDate(new Timestamp(new Date().getTime()));
            user.setUpdatedDate(new Timestamp(new Date().getTime()));
            userProfileDAO.save(user);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User successfully created! (id = " + user.getUserId() + ")";
    }

    @RequestMapping(value = "/findAllUsers")
    public List<UserProfile> findAllUsers(){
        List<UserProfile> users;
        try {
            users = (List<UserProfile>) userProfileDAO.findAll();
        }
        catch (Exception ex) {
            throw new RuntimeException("Error findAllUsers: " + ex.toString());
        }
        return users;

    }

    @Autowired
    private UserProfileDAO userProfileDAO;
}
