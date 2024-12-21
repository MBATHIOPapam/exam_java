package com.example.datas.repositories.list.impl;

import com.example.datas.entities.Client;
import com.example.datas.repositories.IRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IRepository<Client> {
    private final List<Client> clients = new ArrayList<>();

    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients);
    }

    @Override
    public Client getById(int id) {
        return clients.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void update(Client client) {
        Client existingClient = getById(client.getId());
        if (existingClient != null) {
            clients.remove(existingClient);
            clients.add(client);
        }
    }

    @Override
    public void delete(int id) {
        clients.removeIf(client -> client.getId() == id);
    }

    @Override
    public Client findById(String id) {
        return clients.stream().filter(c -> c.getTéléphone().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(Client client) {
        add(client);
    }

    @Override
    public List<Client> findAll() {
        return getAll();
    }
}
