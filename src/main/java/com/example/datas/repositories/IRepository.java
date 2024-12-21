package com.example.datas.repositories;

import java.util.List;

public interface IRepository<T> {
    void add(T entity);
    List<T> getAll();
    T getById(int id);
    void update(T entity);
    void delete(int id);
    T findById(String id);
    void save(T data);
    List<T> findAll();
}
