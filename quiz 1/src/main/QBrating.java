package main;

import java.util.Scanner;

public class QBrating {
	
	private static Double qbrating(Double someatt, Double somecomp, Double someyds, Double someintd, Double someintercept){
		return ((((somecomp/someatt)-0.3)*5 + ((someyds/someatt)-3)*0.25 + (someintd/someatt)*20 + 2.375 - (someintercept/someatt)*25)/6) * 100;
	}

	public static void main(String[] args) {
		Double att, comp, yds, td,intercept;
		Scanner input = new Scanner( System.in );
		System.out.print("Enter the att: ");
		att = input.nextDouble();
		System.out.print("Enter the comp: ");
		comp = input.nextDouble();
		System.out.print("Enter the yds: ");
		yds = input.nextDouble();
		System.out.print("Enter the td: ");
		td = input.nextDouble();
		System.out.print("Enter the intercept: ");
		intercept = input.nextDouble();	
		
		Double rating = qbrating(att,comp,yds,td,intercept);
		
		System.out.println("QB rating: " + rating);
		
	}


}
