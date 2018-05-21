package com.mockii.controller;

import com.mockii.dao.OccupationsDAO;
import com.mockii.entity.Occupations;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Chouhan on 12/16/16.
 */
@RestController
@Api(value = "Occupations API Operations")
public class OccupationsController {

    @Autowired
    private OccupationsDAO occupationsDAO;

    @RequestMapping(value = "/findAllOccupations", method = RequestMethod.GET)
    @ResponseBody
    public List<Occupations> findAllOccupations(){
        List<Occupations> occupations;
        try {
            occupations = (List<Occupations>) occupationsDAO.findAll();
        }
        catch (Exception ex) {
            throw new RuntimeException("Error findAllOccupations: " + ex.toString());
        }
        return occupations;
    }

}
