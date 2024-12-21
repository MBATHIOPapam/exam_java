package com.example.datas.repositories.list;

import com.example.datas.entities.Client;

import java.util.List;

public interface IClientRepository {
    void save(Client client); // Sauvegarder un client
    Client findByPhone(String phone); // Rechercher un client par téléphone
    List<Client> findAll(); // Liste de tous les clients
}
