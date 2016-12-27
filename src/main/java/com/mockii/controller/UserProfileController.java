package com.mockii.controller;

import com.mockii.dao.UserProfileDAO;
import com.mockii.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Billa on 12/12/16.
 */
@RestController(value = "/user")
public class UserProfileController {
    @RequestMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody UserProfile user) {
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

    @RequestMapping(value = "/findAllUsers", method = RequestMethod.GET)
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
