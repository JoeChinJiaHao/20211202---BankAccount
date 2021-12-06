package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UTestBAcc2 {
    @Test
    public void Basic2(){
        BankAccount b = new BankAccount("Wilson",500f);
        assertTrue(b.GetAccBalance()==500f);
    }
}
