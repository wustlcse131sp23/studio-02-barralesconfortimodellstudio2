package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int totalSimulations = in.nextInt();
		

		
		for (int i = 0; i < totalSimulations; i++)
		{int playNumber = 0;
		while (startAmount > 0 && startAmount < winLimit)
		
		{
			double rnd = Math.random();
			boolean randomPlay = (rnd < winChance);
			
			{  
			if (randomPlay)
			{
				startAmount++;	
				
			}
			
			else
				
			{ 
				startAmount--;
			}
			playNumber++;
			
		}
			System.out.println("Simulation day number: " + i);
			System.out.println("Number of plays: " + playNumber);
			if (startAmount == winLimit)
			System.out.println("Success");
			else
			System.out.println("Ruin");
			}
		}
		}
	}
	

