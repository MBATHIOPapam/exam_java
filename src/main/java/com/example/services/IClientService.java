package com.example.services;

import com.example.core.services.IService;
import com.example.datas.entities.Client;
 import java.util.List;

public interface IClientService extends IService<Client> {
    Client selectBySurname(String surname);
    void createClient(Client client);
    List<Client> listClients();
    Client searchClient(String phone);
    void createDebt(Debt debt);
    List<Debt> getUnsettledDebtsByClient(String phone);

}
