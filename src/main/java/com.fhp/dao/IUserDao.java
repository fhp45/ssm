package com.fhp.dao;

import com.fhp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    User selectUser(long id);
}
