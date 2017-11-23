/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agm.service.impl;

import agm.model.Client;
import agm.service.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kmojica
 */
public class ServiceImpl implements Service{

    @Override
    public List<Client> getAllClients() {
        final List<Client> clients = new ArrayList<>();
        final Client client1 = new Client();
        client1.setBusinessName("Business 1");
        client1.setPrimaryAddress("Primary 1");
        client1.setEmailAddress("email@address 1");
        clients.add(client1);
        final Client client2 = new Client();
        client2.setBusinessName("Business 2");
        client2.setPrimaryAddress("Primary 2");
        client2.setEmailAddress("email@address 2");
        clients.add(client2);
        final Client client3 = new Client();
        client3.setBusinessName("Business 3");
        client3.setPrimaryAddress("Primary 3");
        client3.setEmailAddress("email@address 3");
        clients.add(client3);
       
        return clients;
    }

    @Override
    public String[] getAllBusinessNames() {
        return this.getAllClients().stream().map(c-> c.getBusinessName()).collect(Collectors.toList()).toArray(new String[0]);
    }

    @Override
    public Client getClientByBusinessName(String businessName) {
        return  this.getAllClients().stream().filter(c-> c.getBusinessName().equals(businessName)).findFirst().orElse(null);
    }
    
}
