package com.example.views;

import com.example.datas.entities.Client;
import com.example.services.IClientService;

import java.util.Scanner;

public interface IClientView extends IView<Client> {

    void createClientView();

    /**
     * Lists all clients in the system.
     */
    void listAllClients();

    /**
     * Displays details of a client by their phone number.
     */
    void showClientDetailsByPhone();

    /**
     * Creates a debt for a client.
     */
    void createDebtView();

    /**
     * Lists all unsettled debts of clients.
     */
    void listUnsettledDebts();

    /**
     * Allows the user to input client details and create a new client.
     */
    default void createClient(IClientService clientService) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter surname:");
            String surname = scanner.nextLine();
            System.out.println("Enter phone:");
            String phone = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();

            Client client = new Client(surname, phone, address, 0);
            clientService.createClient(client);
            System.out.println("Client created successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while creating the client: " + e.getMessage());
        }
    }

    /**
     * Displays a list of all clients.
     */
    default void listClients(IClientService clientService) {
        clientService.listClients().forEach(System.out::println);
    }

    /**
     * Prompts the user to input client details for operations requiring a client selection.
     *
     * @return the client object
     */
    Client saisir();
}
