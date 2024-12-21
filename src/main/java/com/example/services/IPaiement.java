package com.example.services;

import com.example.datas.entities.Paiement;

public interface IPaiement {
    Double getMontantPaiement();
    void changerSolde(Paiement paiement);
    void registerPayment(Paiement paiement);
}
