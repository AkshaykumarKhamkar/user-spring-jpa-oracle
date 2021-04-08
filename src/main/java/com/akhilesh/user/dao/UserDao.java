package com.akhilesh.user.dao;

import com.akhilesh.user.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * User: Akhilesh Pandey
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
