package com.example.services.impl;

import com.example.core.services.IService;
import com.example.core.services.impl.ServiceImpl;
import com.example.datas.entities.User;
import com.example.datas.repositories.list.impl.UserRepository;
import com.example.services.IPaiement;
import com.example.services.IUserService;
import com.example.datas.repositories.IRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl extends ServiceImpl<User> implements IUserService{
    private final IRepository<User> userRepository;



    public UserServiceImpl(IRepository<User> userRepository) {
        this.userRepository = userRepository;
     }

    private PaiementOm paiementOm = new PaiementOm();


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deactivateUser(String login) {
        User user = userRepository.findById(login);
        if (user != null) {
            user.setRole("DESACTIVE");
        }
    }

    @Override
    public List<User> listUsersByRole(String role) {
        return userRepository.findAll().stream()
                .filter(user -> user.getRole().equals(role))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> listActiveUsers() {
        return userRepository.findAll().stream()
                .filter(user -> !"DESACTIVE".equals(user.getRole()))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> selectAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }

    @Override
    public User selectByLogin(String login) {
       
        throw new UnsupportedOperationException("Unimplemented method 'selectByLogin'");
    }

    @Override
    public void insert(User object) {
       
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void deactivateUser(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deactivateUser'");
    }

    @Override
    public void activateUser(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'activateUser'");
    }

    public IRepository<User> getUserRepository() {
        return userRepository;
    }

    public PaiementOm getPaiementOm() {
        return paiementOm;
    }

    public void setPaiementOm(PaiementOm paiementOm) {
        this.paiementOm = paiementOm;
    }

    @Override
    public Iterable<User> getAllUsers() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }
    
}
