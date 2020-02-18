package interestcalculator;

import java.util.Scanner;

public class InterestCalci {
	int principle,time,rateofinterest;
	
	public void readInput()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter the principle amount");
		principle=read.nextInt();
		System.out.println("enter time period");
		time=read.nextInt();
		System.out.println("enter rate of interest");
		rateofinterest=read.nextInt();
		read.close();
	}
	public void SimpleInterest()
	{
		readInput();
		double simpleinterest=(double)principle*time*rateofinterest/100;
		System.out.println("Simple interest is "+simpleinterest);
	}
	public void CompoundInterest()
	{
		readInput();
		float CI;
		CI=1+rateofinterest*(float)0.01;
		CI=(float)Math.pow(CI, time);
		CI=principle*CI-principle;
		System.out.println("Compound interest is "+CI);
	}

}
