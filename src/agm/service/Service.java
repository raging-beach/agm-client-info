/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agm.service;

import agm.model.Client;
import java.util.List;

/**
 *
 * @author kmojica
 */
public interface Service {
    
    public List<Client> getAllClients();
    
    public String[] getAllBusinessNames();
    
    public Client getClientByBusinessName(String businessName);
    
}
