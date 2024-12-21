package com.example.views.impl;

import com.example.entities.Dette;
import com.example.entities.Paiement;
import com.example.services.IDetteService;

import java.time.LocalDate;
import java.util.Scanner;

public class DetteView {
    private final IDetteService detteService;
    private final Scanner scanner;

    public DetteView(IDetteService detteService) {
        this.detteService = detteService;
        this.scanner = new Scanner(System.in);
    }

    public void createDetteView() {
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        System.out.println("Enter amount paid:");
        double amountPaid = scanner.nextDouble();
        Dette dette = new Dette(0, amount, amountPaid);
        detteService.createDette(dette);
        System.out.println("Dette created successfully.");
    }
    public void displayAllDettes() {
        detteService.getAllDettes().forEach(System.out::println);
    }

    public void recordPaymentView() {
        System.out.println("Enter dette ID:");
        int id = scanner.nextInt();
        Dette dette = detteService.getDetteById(id);
        if (dette != null) {
            System.out.println("Enter payment amount:");
            double amount = scanner.nextDouble();
            Paiement paiement = new Paiement(0, LocalDate.now(), amount);
            detteService.recordPayment(dette, paiement);
            System.out.println("Payment recorded successfully.");
        } else {
            System.out.println("Dette not found.");
        }
    }
}

