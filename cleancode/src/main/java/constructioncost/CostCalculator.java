package constructioncost;

import java.util.Scanner;

public class CostCalculator {
	int materialChoice;
	long area;
	public void calculate()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter your choice for material to be used");
		System.out.println("1.Standard Materials 2.Above Standard Materials 3.High standard materials 4.High standard materials andAutomated house");
		materialChoice=reader.nextInt();
		System.out.println("Enter area of house in square feets");
		area=reader.nextInt();
		long cost=0,flag=0;
		switch(materialChoice)
		{
		case 1:cost=1200*area;
		break;
		case 2:cost=1500*area;
		break;
		case 3:cost=1800*area;
		break;
		case 4:cost=area*2500;
		break;
		default:flag=1;System.out.println("enter valid choice");
		}
		if(flag==0)
		System.out.println("cost for constructing a house is "+cost);
	}}
		
