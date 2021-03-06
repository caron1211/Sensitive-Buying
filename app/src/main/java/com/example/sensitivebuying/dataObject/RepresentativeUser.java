package com.example.sensitivebuying.dataObject;

import com.example.sensitivebuying.dataObject.Product;
import com.example.sensitivebuying.dataObject.User;

import java.io.Serializable;
import java.util.ArrayList;

public class RepresentativeUser extends User implements Serializable {


    private String companyName;
    public ArrayList<Product> productsOfCompany;


    public RepresentativeUser() {
        super();
        productsOfCompany = new ArrayList<>();
    }


    public RepresentativeUser(String name, String mail, String  companyName, ArrayList<Product> productsOfCompany) {
        super(name, mail,true);
        this.companyName = companyName;
        this.productsOfCompany= new ArrayList<>(productsOfCompany);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Product> getProductsOfCompany() {
        return productsOfCompany;
    }

    public void setProductsOfCompany(ArrayList<Product> productsOfCompany) {
        this.productsOfCompany = productsOfCompany;
    }

}
