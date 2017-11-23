/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agm.model;

import java.util.Date;

/**
 *
 * @author kmojica
 */
public class Client {
    
    private String businessName;
    private String primaryAddress;
    private String secondaryAddress;
    private String contactNumber;
    private String secondaryContactNumber;
    private String emailAddress;
    private String status;
    private Date contractedDate;
    private Date discontinuedDate;
    
    private Date createdDate;
    private String createdBy;
    private Date lastModBy;
    private String lastModDate;
    
    
    public Client() {
        super();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == String.class) {
            final String cmpObj = obj.toString();
            return this.businessName.equals(cmpObj);
        }
        return false;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSecondaryContactNumber() {
        return secondaryContactNumber;
    }

    public void setSecondaryContactNumber(String secondaryContactNumber) {
        this.secondaryContactNumber = secondaryContactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
}
