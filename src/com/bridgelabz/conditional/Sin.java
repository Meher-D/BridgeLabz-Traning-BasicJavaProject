package com.bridgelabz.conditional;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sin {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int x;
		double angleX;
		int noOddSeries;
		
		System.out.println("Enter angle between 0 to 360");
		x=scanner.nextInt();
		System.out.println("Enter odd number for series");
		noOddSeries=scanner.nextInt();
		if(noOddSeries%2!=0) {
			if(x>=0&&x<=360) {
				angleX=utility.CalAngleX(x);
				utility.SinXSeries(angleX,noOddSeries);
			}else
				System.out.println("Please enter valid angle");
			
		}else
			System.out.println("Please enter valid odd no.");
		
		scanner.close();
	}


	}