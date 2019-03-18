package com287;
import java.util.Scanner;

public class TRabsvd {
	  public static void main (String args[])
	  {
	    int balance=5000, withdraw, deposit;
		 Scanner s = new Scanner( System.in);
		 while (true)
		  {
			 System.out.println("Automated Teller Machine");
		     System.out.println(" Choose 1 for Withdraw");
		     System.out.println("Choose 2 for Deposit ");
		     System.out.println("cHOOSE 3 FOR cHECK bALANCE");
		     System.out.println("cHOOSE 4 FOR exit");
		    1 System.out.println("cHOOSE THE OPERATION YOU WANT TO PERFORM;");
			  int n = s.nextInt();
			  switch (n)
			  {
			  case 1:
			  System.out.print("Enter money to be withdrawn");
			  withdraw = s.nextInt();
			  if(balance >=withdraw)
			  {
				  balance=balance-withdraw;
				  System.out.println("Please collect your money");
			  }
			  else
			  {
				  System.out.println("Insufficent Balnce");
			  }
			  System.out.println("");
			  break;
			  
			  case 2:
			  System.out.print("Enter money to be deposited ");
			  deposit = s.nextInt();
			  balance = balance+ deposit;
			  System.out.println("Your money has been successfully depsited");
			  System.out.println("");
			  break;
			  case 3:
			  System.out.println(" Balance : "+balance);
			  System.out.println("");
			  break;
			  case 4:
			  System.exit(0);
			  }
			  }
			  }
		  }
	  


