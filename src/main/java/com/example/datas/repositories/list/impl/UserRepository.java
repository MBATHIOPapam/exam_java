package com.example.datas.repositories.list.impl;

import com.example.datas.entities.User;
import com.example.datas.repositories.IRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IRepository<User> {
    private final List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User getById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void update(User user) {
        User existingUser = getById(user.getId());
        if (existingUser != null) {
            users.remove(existingUser);
            users.add(user);
        }
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public User findById(String id) {
        return users.stream().filter(u -> u.getUsername().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(User user) {
        add(user);
    }

    @Override
    public List<User> findAll() {
        return getAll();
    }
}
