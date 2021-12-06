package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void Basic(){
    BankAccount b = new BankAccount("Wilson");
    assertTrue(b.GetAccBalance()==0);
    }
    @Test
    public void Basic2(){
        BankAccount b = new BankAccount("Wilson",500f);
        assertTrue(b.GetAccBalance()==500f);
    }
    @Test
    public void Basic3(){
        BankAccount b = new BankAccount("Wilson",500f);
        b.Deposit(300f);
        assertTrue(b.GetAccBalance()==800f);
    }
    @Test
    public void Basic4(){
        BankAccount b = new BankAccount("Wilson",500f);
        b.Withdraw(300f);
        assertTrue(b.GetAccBalance()==200f );
    }
    @Test
    public void Basic5(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson");
        assertTrue(b.GetAccBalance()==0f && b.getInterest()==3f && b.getDuration()==6);
    }
    @Test
    public void Basic6(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f);
        assertTrue(b.GetBalance()==503f && b.getInterest()==3f && b.getDuration()==6);
    }
    @Test
    public void Basic7(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f,5f,9);
        assertTrue(b.GetBalance()==505f && b.getInterest()==5f && b.getDuration()==9);
    }
    @Test
    public void Basic8(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f,5f);
        assertTrue(b.GetBalance()==505f && b.getInterest()==5f && b.getDuration()==6);
    }   
    @Test
    public void Basic9(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f,5f);
        b.Withdraw(50f);
        b.Deposit(60f);
        assertTrue(b.GetBalance()==505f && b.getInterest()==5f && b.getDuration()==6);
    } 
    @Test
    public void Basic10(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f,5f);
        b.Withdraw(50f);
        b.Deposit(60f);
        assertTrue(b.GetBalance()==505f && b.getInterest()==5f && b.getDuration()==6);
    } 
    @Test
    public void Basic11(){
        FixedDepositAccount b = new FixedDepositAccount("Wilson",500f,5f);
        b.Withdraw(50f);
        b.Deposit(60f);
        b.ChangeDuration(7);
        b.ChangeInterestRate(8f);
        assertTrue(b.GetBalance()==508f && b.getInterest()==8f && b.getDuration()==7);
    }
}
