package com.fhp.dao;

import com.fhp.model.User;

public interface IUserDao {
    User selectUser(long id);
}
