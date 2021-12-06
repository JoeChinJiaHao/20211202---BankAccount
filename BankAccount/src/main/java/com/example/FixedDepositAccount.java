package com.example;
//import com.example.BankAccount;
public class FixedDepositAccount extends BankAccount  {
    
    private float interest;
    private Integer duration;
    private boolean InterestChanged;
    private boolean DurationChanged;

    public FixedDepositAccount(String i, float b){
        super(i,b);
        this.Start();
        InterestChanged=false;
        DurationChanged=false;
        SetName(i);
        setInitialBalance(b);
        interest = 3;
        duration = 6;
    }
    public void ChangeInterestRate(float f){
        if(InterestChanged){
            throw new IllegalArgumentException("Interest has been set once before");
        }
        else{
            interest = f;
            InterestChanged=true;
            System.out.printf("Thanks for waiting, your updated interest rate is %s! \n",f);
        }
    }
    public void ChangeDuration(Integer i){
        if(DurationChanged){
            throw new IllegalArgumentException("Duration has been set once before");
        }
        else{
            duration = i;
            DurationChanged=true;
            System.out.printf("Thanks for waiting, your updated duration is %s! \n",i);
        }
    }
    public FixedDepositAccount(String i){
        super(i);
        InterestChanged=false;
        DurationChanged=false;
        this.Start();
        SetName(i);
        setInitialBalance(0);
        interest = 3;
        duration = 6;
    }
    public FixedDepositAccount(String i, float b,float InterestRate){
        super(i,b);
        InterestChanged=false;
        DurationChanged=false;
        this.Start();
        SetName(i);
        setInitialBalance(b);
        interest = InterestRate;
        duration = 6;
    }
    public FixedDepositAccount(String i, float b,float InterestRate, Integer d){
        super(i,b);
        InterestChanged=false;
        DurationChanged=false;
        this.Start();
        SetName(i);
        setInitialBalance(b);
        interest = InterestRate;
        duration = d;
    }

    public float GetBalance(){
        return this.GetAccBalance()+interest;
    }
    public float getInterest(){
        return this.interest;
    }
    public Integer getDuration(){
        return this.duration;
    }

    public void SetAccB(float i){

    }
    @Override
    public void Deposit(Float i){
        System.out.println("No Action taken");
    }
    @Override
    public void Withdraw(Float i){
        System.out.println("No action taken");;
    }
}
    
