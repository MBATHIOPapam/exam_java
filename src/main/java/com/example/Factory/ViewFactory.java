package com.example.Factory;

import com.example.services.IClientService;
import com.example.views.impl.ClientView;

public class ViewFactory {
    public static ClientView createClientView() {
        IClientService clientService = ServiceFactory.getClientServiceInstence(); // Instance valide
        return new ClientView(clientService); // Injecte le service dans ClientView
    }
}
