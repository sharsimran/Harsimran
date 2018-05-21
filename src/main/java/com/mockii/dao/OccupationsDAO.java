package com.mockii.dao;

import com.mockii.entity.Occupations;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Chouhan on 12/16/16.
 */
@Transactional
public interface OccupationsDAO extends JpaRepository<Occupations, Long> {

}
