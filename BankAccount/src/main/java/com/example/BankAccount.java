package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//import com.example.Startable;
public class BankAccount implements Startable{
        //model a bank account
        //getter and setters methods would be provided to access and edit the hidden values
        private String name;
        private String accountNumber;
        private boolean initBalSet;
        private float accountBalance;
        private List<String> transactions = new ArrayList<String>();
        private boolean isClosed;
        private boolean NameSet;
        private String DateCreated;
        private String DateClosed;
        String temp = new String();
        String temp2 = new String();
        public BankAccount(String i){
                //List<String> transactions = new ArrayList<String>();
                SetName(i);
                this.Start();
               
               
        };
        public BankAccount(String i, float b){
                //List<String> transactions = new ArrayList<String>();
                this.Start();
                SetName(i);
                setInitialBalance(b);
                
        }
        //Implement startable
        
        public void Start() {
                // TODO Auto-generated method stub
                NameSet=false;
                initBalSet=false;
                isClosed=false;
                accountBalance=0;
                accountNumber=UUID.randomUUID().toString().replace("-","");
                DateCreated=(java.time.LocalDate.now()).toString();
                //System.out.println(java.time.LocalDate.now());
                System.out.printf("Account created on %s \n",DateCreated);
                System.out.printf("Your account number is %s \n",accountNumber);
        }
       
        
        public void Stop() {
                // TODO Auto-generated method stub
                isClosed=true;
                DateClosed=(java.time.LocalDate.now()).toString();
                System.out.printf("Account closed on %s \n",DateClosed);
        }
        

        public void SetName(String i){
                if(NameSet){
                        throw new IllegalArgumentException("Name has been Set");
                }
                else{
                        name = i;
                        NameSet=true;
                        System.out.printf("Thanks for waiting %s, your account is ready! \n",i);
                }
        }
        public void setInitialBalance(float b){
                if(initBalSet){
                        throw new IllegalArgumentException("Initial balance has been Set");
                }else{
                        accountBalance=b;
                        initBalSet=true;
                }
        }
        public boolean getClosed(){
                if(isClosed){
                        return(true);
                }else{
                        return(false);
                }
        }
        public String GetAccNumber(){
                return accountNumber;
        }
        public float GetAccBalance(){
                return accountBalance;
        }
        public String GetAccName(){
                return name;
        }
        public List<String> GetTransHistory(){
                return transactions;
        }

        //deposits
        public void Deposit(Float i){
                if(this.isClosed){
                        throw new IllegalArgumentException("Deposit Error: Account is closed");
                }else if(i<=0){
                        throw new IllegalArgumentException("Deposit Error: Negative value added");
                }else{
                        accountBalance+=i;
                        //add to transaction
                        temp="";
                        temp2="";
                        temp =  i.toString();
                        temp2 = (java.time.LocalDate.now()).toString();
                        transactions.add("deposit "+ temp +" at " + temp2);
                }
        }
        //withdrawal
        public void Withdraw(Float i){
                if(this.isClosed){
                        throw new IllegalArgumentException("Withdraw Error: Account is closed");
                }else if(i<=0){
                        throw new IllegalArgumentException("Withdraw Error: Negative value entered");
                }else if(i>this.accountBalance){
                        throw new IllegalArgumentException("Withdraw Error: Value too big (" + i + ")");
                }
                else{
                        accountBalance-=i;
                        temp="";
                        temp2="";
                        temp = i.toString();
                        temp2 = (java.time.LocalDate.now()).toString();
                        transactions.add("withdraw "+ temp +" at " + temp2);
                
                }
        }
       

}
