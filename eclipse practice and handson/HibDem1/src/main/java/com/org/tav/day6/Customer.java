package com.org.tav.day6;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer1")
public class Customer {     @Id
    @Column(name="custid")
    private int customerId;

    @Column(name="custname")
    private String customerName;

    @Column(name="custaddress")
    private String customerAddress;     public int getCustomerId() {
        return customerId;
    }     public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }     public String getCustomerName() {
        return customerName;
    }     public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }     public String getCustomerAddress() {
        return customerAddress;
    }     public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }


}