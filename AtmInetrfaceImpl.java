package com.skv.www;

import java.util.HashMap;
import java.util.Map;

public class AtmInetrfaceImpl implements Interface{

	ATM atm=new ATM();
	
	Map<Double, String> map=new HashMap<Double, String>();
	
	
	@Override
	public void viewBalance() {
		System.out.println("Available balance :"+atm.getBalance());
		//viewBalance();
	}

	@Override
	public void withDrawAmount(double withDrawAmount) {
		
		if(withDrawAmount<=atm.getBalance()) {
		map.put(withDrawAmount,"Amount WithDrwan");
		System.out.println("Collect cash..."+withDrawAmount);
		atm.setBalance(atm.getBalance() - withDrawAmount);
		viewBalance();
		}
		else {
			System.out.println("Insufficient Amount");
		}
		
//		if (withdrawAmount <= atm.getBalance()) {
//            ministmt.put(withdrawAmount, " Amount Withdrawn");
//            System.out.println("Collect the Cash " + withdrawAmount);
//            atm.setBalance(atm.getBalance() - withdrawAmount);
//            viewBalance();
//        } else {
//            System.out.println("Insufficient Balance !!");
//        }
		
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		map.put(depositeAmount, "Amount Deposited");
		System.out.println(depositeAmount+"Amount Deposited Successfull..");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStmt() {
		for(Map.Entry<Double, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
//		for(Map.Entry<Double,String> m:ministmt.entrySet()){
//            System.out.println(m.getKey()+""+m.getValue());
//        }
	}

	
	
		
	

}
