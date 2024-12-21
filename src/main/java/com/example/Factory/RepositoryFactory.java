package com.example.Factory;

import com.example.datas.repositories.IRepository;
import com.example.datas.repositories.list.impl.ClientRepository;
import com.example.datas.entities.Client;

public class RepositoryFactory {
    @SuppressWarnings("unchecked")
    public static <T> IRepository<T> createRepository(Class<T> clazz) {
        if (clazz == Client.class) {
            return (IRepository<T>) new ClientRepository();
        }
        throw new IllegalArgumentException("No repository implementation found for: " + clazz);
    }
}
