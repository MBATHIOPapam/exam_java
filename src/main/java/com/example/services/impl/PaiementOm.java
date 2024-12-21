package com.example.services.impl;

import java.util.List;

import com.example.Factory.ServiceFactory;
import com.example.datas.entities.User;
import com.example.services.IPaiement;
import com.example.services.IUserService;

public class PaiementOm implements IPaiement{
    private IUserService userService = ServiceFactory.getUserServiceInstence();

    List<User> users = userService.selectAll();
    @Override
    public Double getMontantPaiement() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMontantPaiement'");
    }

    @Override
    public Void changerSolde(Double montant) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerSolde'");
    }
    //code de epaiement Wave
}
