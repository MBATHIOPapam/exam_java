package com.example.Factory;

import com.example.datas.entities.User;
import com.example.datas.repositories.IRepository;
import com.example.datas.repositories.list.impl.ClientRepository;
import com.example.datas.repositories.list.impl.UserRepository;
import com.example.services.IClientService;
import com.example.services.IUserService;
import com.example.services.impl.ClientServiceImpl;
import com.example.services.impl.UserServiceImpl;

public class ServiceFactory {
    public static IClientService getClientServiceInstence() {
        // Crée une instance valide de ClientRepository
        ClientRepository clientRepository = new ClientRepository();
        // Retourne une instance de ClientServiceImpl avec le repository injecté
        return new ClientServiceImpl(clientRepository);
    }

    public static IUserService getUserServiceInstence() {
        IRepository<User> userRepository = new UserRepository(); // Ajout de l'implémentation UserRepository
        return new UserServiceImpl(userRepository);
    }
}
