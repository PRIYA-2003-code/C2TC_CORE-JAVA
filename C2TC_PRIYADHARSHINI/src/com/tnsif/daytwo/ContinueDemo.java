package com.tnsif.daytwo;
//program to demonstrate continue statement
public class ContinueDemo {

	public static void main(String[] args) {
	for(int k=5;k<15;k++) {
		//odd number are skipped
		if(k%2!=0)
			//if k%2==0 it skipped even number
			continue;
		System.out.println(k + " ");
	}
		
		
		// TODO Auto-generated method stub

	}

}
