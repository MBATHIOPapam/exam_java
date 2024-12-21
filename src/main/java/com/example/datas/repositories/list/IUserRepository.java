package com.example.datas.repositories.list;

import com.example.entities.User;
import java.util.List;

public interface IUserRepository {

    // Méthode pour ajouter un utilisateur
    void addUser(User user);

    // Méthode pour récupérer tous les utilisateurs
    List<User> getAllUsers();

    // Méthode pour rechercher un utilisateur par ID
    User getUserById(int id);

    // Méthode pour activer un utilisateur
    void activateUser(int id);

    // Méthode pour désactiver un utilisateur
    void deactivateUser(String login);
}
