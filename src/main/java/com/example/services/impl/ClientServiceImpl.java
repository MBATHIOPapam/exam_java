package com.example.services.impl;

import com.example.datas.entities.Client;
import com.example.datas.repositories.IRepository;
import com.example.services.Debt;
import com.example.services.IClientService;

import java.util.List;
import java.util.stream.Collectors;

public class ClientServiceImpl implements IClientService {
    private final IRepository<Client> clientRepository;

    public ClientServiceImpl(IRepository<Client> clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
public void createClient(Client client) {
    if (client != null && client.getTéléphone() != null) {
        clientRepository.save(client);
        System.out.println("Client enregistré : " + client);
    } else {
        System.out.println("Impossible d'enregistrer le client : données invalides !");
    }
}


    @Override
    public List<Client> listClients() {
        return clientRepository.getAll();
    }

    @Override
    public Client selectBySurname(String surname) {
        return clientRepository.getAll().stream()
                .filter(client -> client.getSurname().equalsIgnoreCase(surname))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Client searchClient(String phone) {
        return clientRepository.getAll().stream()
                .filter(client -> client.getTéléphone().equals(phone))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void createDebt(Debt debt) {
        // Implémentation pour créer une dette
        Client client = searchClient(debt.getClientPhone());
        if (client != null) {
            client.addDebt(debt); // Suppose que la classe `Client` a une méthode `addDebt`
            System.out.println("Debt created successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    @Override
public void save(Client client) {
    if (client == null || client.getSurname() == null || client.getSurname().isEmpty()
            || client.getTéléphone() == null || client.getTéléphone().isEmpty()) {
        throw new IllegalArgumentException("Impossible d'enregistrer le client : données invalides !");
    }
    IRepository<Client> repository;
        repository.save(client); // Enregistre le client dans le dépôt
}

    @Override
    public List<Debt> getUnsettledDebtsByClient(String phone) {
        Client client = searchClient(phone);
        if (client != null) {
            return client.getDebts().stream()
                    .filter(debt -> !debt.isSettled())
                    .collect(Collectors.toList());
        }
        return List.of();
    }

    @Override
    public List<Client> selectAll() {
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }

    @Override
    public void insert(Client object) {
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Client object) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Client selectById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'selectById'");
    }

    @Override
    public void createDebt(Debt debt) {
        throw new UnsupportedOperationException("Unimplemented method 'createDebt'");
    }
}
