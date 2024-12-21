package com.example.views.impl;

import com.example.services.IClientService;
import com.example.views.IClientView;

import java.util.List;
import java.util.Scanner;
import com.example.datas.entities.Client;

public class ClientView implements IClientView {
    private final IClientService clientService;

    public ClientView(IClientService clientService) {
        this.clientService = clientService;
    }

//     @Override
//     public void createClientView() {
//         try (Scanner scanner = new Scanner(System.in)) {
//                 System.out.println("=== Créer un nouveau client ===");
//                 System.out.print("Entrez le nom : ");
//                 String surname = scanner.nextLine();

//                 System.out.print("Entrez le téléphone : ");
//                 String phone = scanner.nextLine();

//                 System.out.print("Entrez l'adresse : ");
//                 String address = scanner.nextLine();

//                 // Créez un client et sauvegardez-le via le service
//                 Client client = new Client(surname, phone, address, 0);
//                 clientService.createClient(client);
//         }

//         System.out.println("Client créé avec succès !");
//     }

    public void createClientView() {
        try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("=== Création d'un client ===");
                System.out.print("Nom : ");
                String name = scanner.nextLine();
                System.out.print("Téléphone : ");
                String phone = scanner.nextLine();
    
                Client client = new Client(phone, phone, phone, 0);
                client.setSurname(name);
                client.setTéléphone(phone);
    
                try {
                    clientService.createClient(client);
                    System.out.println("Client créé avec succès !");
                } catch (IllegalArgumentException e) {
                    System.out.println("Impossible d'enregistrer le client : " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Une erreur est survenue : " + e.getMessage());
                }
        }
    }
    

@Override
public void afficher(List<Client> list) {
        throw new UnsupportedOperationException("Unimplemented method 'afficher'");
}

public void listClients() {
        List<Client> clients = clientService.listClients(); // Appel de la méthode
        if (clients.isEmpty()) {
            System.out.println("Aucun client trouvé.");
        } else {
            System.out.println("=== Liste des clients ===");
            clients.forEach(System.out::println);
        }
}

@Override
public void listAllClients() {
        throw new UnsupportedOperationException("Unimplemented method 'listAllClients'");
}

@Override
public void showClientDetailsByPhone() {
        throw new UnsupportedOperationException("Unimplemented method 'showClientDetailsByPhone'");
}

@Override
public void createDebtView() {
        throw new UnsupportedOperationException("Unimplemented method 'createDebtView'");
}

@Override
public void listUnsettledDebts() {
        throw new UnsupportedOperationException("Unimplemented method 'listUnsettledDebts'");
}

@Override
public Client saisir() {
        throw new UnsupportedOperationException("Unimplemented method 'saisir'");
}
}
