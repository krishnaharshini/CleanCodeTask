import java.util.Scanner;
import java.io.*;
import interestcalculator.InterestCalci;

public class SiandCi {
	public static void main(String args[]) throws IOException
	{
		int choice;
		PrintWriter writer=new PrintWriter(System.out);
		Scanner read=new Scanner(System.in);
		System.out.println("1.Calculet Simple Interest 2.Calculate Compound Interest");
		choice=read.nextInt();
		InterestCalci calculator=new InterestCalci();
		if(choice==1)
			calculator.SimpleInterest();
		else if(choice==2)
			calculator.CompoundInterest();
		else
			writer.write("invalid choice");
		read.close();
		
	}
	

}
