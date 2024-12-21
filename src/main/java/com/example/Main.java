package com.example;

import com.example.views.impl.ClientView;
import com.example.Factory.ViewFactory;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ClientView clientView = ViewFactory.createClientView();

        System.out.println("1. Créer un client");
        System.out.println("2. Lister les clients");
        System.out.println("3. Rechercher un client par téléphone");
        System.out.print("Choisissez une option : ");

        // int choix = scanner.nextInt();
        // scanner.nextLine(); // Consommer la nouvelle ligne

        @SuppressWarnings("resource")
        int choix = new java.util.Scanner(System.in).nextInt();
        switch (choix) {
            case 1 -> clientView.listClients(); // Appelle la méthode listClients
            default -> System.out.println("Option invalide !");
        }

        switch (choix) {
            case 1 -> clientView.createClientView();
            case 2 -> clientView.listClients();
            case 3 -> clientView.showClientDetailsByPhone();
            default -> System.out.println("Option invalide !");
        }
    }
}
