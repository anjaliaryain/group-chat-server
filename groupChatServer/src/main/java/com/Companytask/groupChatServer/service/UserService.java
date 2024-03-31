package com.Companytask.groupChatServer.service;

import com.Companytask.groupChatServer.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService{
    User registerUser(User user);
    User login(String username, String password);

}


