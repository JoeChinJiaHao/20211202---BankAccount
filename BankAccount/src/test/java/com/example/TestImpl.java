package com.example;

//import java.util.UUID;

public class TestImpl {
    public static void main(String[] args) {
        BankAccount Bank = new BankAccount("Wilson",500.5f);
        //Bank.Stop();
        //System.out.println(UUID.randomUUID().toString().replace("-",""));
        Bank.Deposit(100f);
        Bank.Withdraw(250f);
        System.out.println(Bank.GetAccBalance());
        FixedDepositAccount FDA = new FixedDepositAccount("Jack",5000f);
        FDA.Deposit(300f);
        System.out.println(FDA.GetAccBalance());

        
    }

}
