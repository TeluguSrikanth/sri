package com.skv.www;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	ATM atm=new ATM();
	
	Interface op=new AtmInetrfaceImpl();
	
	int acNum=12345;
	int acPin=123;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to ATM");
	System.out.println("Enter your AC Number :");
	int acn=sc.nextInt();
	System.out.println("Enter our Pin number :");
	int acp=sc.nextInt();
	
	if((acNum==acn) && (acPin==acp)) {
		
		while(true) {
			System.out.println("1.View Balance\n2.WithDraw Amount\n3.Deposite Amount\n4.View Mini Statement\n5.Exit");

		     System.out.println("Enter Your Choice :");
		     int ch=sc.nextInt();
		     
		     if(ch==1) {
		    	 op.viewBalance();
		    	 
		     }
		     else if(ch==2) {
		    	 System.out.println("Enetr deposited Amt :");
		    	 double withDrawAmount=sc.nextDouble();
		    	 op.withDrawAmount(withDrawAmount);
		     }
            else if(ch==3) {
		    	 System.out.println("Enetr deposited Amt :");
		    	 double depo=sc.nextDouble();
		    	 op.depositeAmount(depo);
		     }
            else if(ch==4) {
		    	 op.viewMiniStmt();
		     }
            else if(ch==5) {
            	System.out.println("Take your Card And Thanks for Visiting our ATM");
        		System.exit(0);
		     }
            else {
            	System.out.println("Please enter Currect details :");
            }
		
		
		}
	}
	else {
		System.out.println("Incurrect Account or Pin number :");
		System.exit(0);
	}
		
	
	
	
}

}
