package assignment;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
  int totalDeposits = 10000;
  int creditLimit = 2000;
 @Override
  public int getCash() {
  	int totalcash=totalDeposits+creditLimit;
  	return totalcash;
  }
}

class SavingsAccount extends Assignment2Q3 {
  int totalDeposits = 10000;
  int fixedDepositAmount = 5000;
 @Override
  public int getCash() {
  	int totalcash=totalDeposits+fixedDepositAmount;
  	return totalcash;
  }
}


public class Assignment2Q3 {
	
  public int totalCashInBank(ArrayList<Integer>cash)
  {
  	int totalcash=0;
  	for(int i:cash)
  	{
  		totalcash+=i;
  		
  	}
  	return totalcash;
  }
  public int getCash(){
  	
  }
  public static void main(String[] args) {
  	Assignment2Q3 cash=new Assignment2Q3();
  	
  	CurrentAccount ca=new CurrentAccount();
  	int amount=ca.getCash();
  	SavingsAccount sa=new SavingsAccount();
  	int b=sa.getCash();
  	
  	ArrayList<Integer> cashlist= new ArrayList<>();
  	cashlist.add(amount);
  	cashlist.add(b);
  	
  	int deposit=cash.totalCashInBank(cashlist);
  	System.out.println("Total Cash =  "+deposit);
  	
  	
  }
}

