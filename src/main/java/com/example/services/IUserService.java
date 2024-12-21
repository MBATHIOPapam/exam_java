package com.example.services;


import com.example.core.services.IService;
import com.example.datas.entities.User;
import java.util.List;

public interface IUserService extends IService<User>{
    User selectByLogin(String login);
    void createUser(User user);
    List<User> listUsersByRole(String role);
    //List<User> getAllUsers();
    List<User> listActiveUsers();
    void activateUser(int id);
    void deactivateUser(int id);
    Iterable<User> getAllUsers();
}
