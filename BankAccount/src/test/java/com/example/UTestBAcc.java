package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UTestBAcc {
    @Test
    public void Basic(){
    BankAccount b = new BankAccount("Wilson");
    assertTrue(b.GetAccBalance()==999);
    }
    


}
