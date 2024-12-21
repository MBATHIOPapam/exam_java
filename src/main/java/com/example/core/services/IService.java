package com.example.core.services;

import java.util.List;

//import com.example.datas.entities.User;

public interface IService<T> {
    List<T> selectAll();
    void insert(T object);
    void update(T object);
    void delete(int id);
    T selectById(int id);
}
