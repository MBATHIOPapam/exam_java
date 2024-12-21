package com.example.views.impl;

import com.example.datas.entities.User;
import com.example.services.IUserService;

import java.util.Scanner;

public class UserView {
    private final IUserService userService;
    private final Scanner scanner;

    public UserView(IUserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void createUser() {
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter login:");
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter role (Admin/Boutiquier/Client):");
        String role = scanner.nextLine();

        User user = new User(email, login, password, role);
        userService.createUser(user);
        System.out.println("User created successfully.");
    }

    public void displayAllUsers() {
        userService.getAllUsers().forEach(System.out::println);
    }

    public void listUsersByRole() {
        System.out.println("Enter role to filter (Admin/Boutiquier/Client):");
        String role = scanner.nextLine();
        userService.listUsersByRole(role).forEach(System.out::println);
    }

    public void activateUser() {
        System.out.println("Enter user ID to activate:");
        int id = scanner.nextInt();
        userService.activateUser(id);
        System.out.println("User activated successfully.");
    }
}
