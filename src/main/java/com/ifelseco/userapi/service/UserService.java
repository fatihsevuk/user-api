package com.ifelseco.userapi.service;

import com.ifelseco.userapi.entity.User;
import com.ifelseco.userapi.entity.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRole);
    User findByUsername(String username);
    User findByEmail(String email);

}
