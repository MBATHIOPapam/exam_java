package com.example.datas.entities;

import com.example.services.Debt;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Client {
    public Client(String surname2, String phone, String address, int i) {
        
    }
    private int id;
    private String surname;
    private String téléphone;
    private String adresse;
    private User user;
    public void addDebt(Debt debt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDebt'");
    }
    public void setAddress(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAddress'");
    }
    public void setUser(User user2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUser'");
    } 
}