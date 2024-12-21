package com.example.datas.repositories.list;

import java.util.ArrayList;
import java.util.List;

import com.example.datas.entities.Client;
import com.example.datas.repositories.IRepository;

public class RepositorImpl<T> implements IRepository<T> {
    // Liste générique pour stocker les entités
    protected final List<T> list = new ArrayList<>();

    @Override
    public void add(T entity) {
        list.add(entity);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(list); // Retourne une copie pour éviter les modifications directes
    }

    @Override
    public T getById(int id) {
        // Remarque : Cela suppose que T a une méthode getId().
        // Une alternative serait d'utiliser une interface ou une méthode spécifique pour identifier les entités.
        return list.stream()
                   .filter(entity -> {
                       if (entity instanceof Client client) {
                           return client.getId() == id;
                       }
                       return false;
                   })
                   .findFirst()
                   .orElse(null);
    }

    @Override
    public void update(T entity) {
        // Remarque : Implémentation basée sur une hypothétique méthode getId()
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(entity)) {
                list.set(i, entity);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        list.removeIf(entity -> {
            if (entity instanceof Client client) {
                return client.getId() == id;
            }
            return false;
        });
    }

    @Override
    public T findById(String id) {
        // Remarque : Implémentation basée sur un champ "id" de type String
        return list.stream()
                   .filter(entity -> entity.toString().equals(id))
                   .findFirst()
                   .orElse(null);
    }

    @Override
    public void save(T data) {
        list.add(data);
    }

    @Override
    public List<T> findAll() {
        return getAll();
    }
}
