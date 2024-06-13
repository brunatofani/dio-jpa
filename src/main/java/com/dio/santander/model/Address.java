package com.dio.santander.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    
    @Id
	private String cep;
	private String street;
	private String complement;
	private String neighborhood;
	private String state;

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getComplement() {
        return complement;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    
}
