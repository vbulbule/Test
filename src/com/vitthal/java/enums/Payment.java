package com.vitthal.java.enums;

public enum Payment {
    CHEQUE(1000),
    CREDITCARD(1500),
    DEBITCARD(2000);

    private int minPayment;

    // constructor is parameterised to take an int value
    Payment(int i){
        minPayment=i;
    }
    int getMinPayment(){
        return minPayment;
    }


}
