package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        System.out.println("Checkout Method from ShoppingCart Called");
    }
    public int quantity(){
        return 2;
    }
}
