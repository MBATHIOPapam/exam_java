package com.example.core.services.impl;


import com.example.core.services.IService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class ServiceImpl<T> implements IService<T> {
    protected List<T> repository = new ArrayList<>();

    @Override
    public List<T> selectAll() {
        return new ArrayList<>(repository);
    }

    @Override
    public void insert(T object) {
        repository.add(object);
    }

    @Override
    public void update(T object) {
        int index = repository.indexOf(object);
        if (index != -1) {
            repository.set(index, object);
        }
    }

    @Override
    public void delete(int id) {
        repository.removeIf(item -> repository.indexOf(item) == id);
    }

    @Override
    public T selectById(int id) {
        Optional<T> result = repository.stream()
        .skip(id)
        .findFirst();
return result.orElse(null);
}
}


