package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please type a number");
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0;i < n;i++)
		{
			array[i] = i+1;
		}
		for (int a = 2;a <= n;a++)
		{
			for (int i = a+1;i < n;i++)
				if (array[i] % a ==0)
					{
					array[i] = 0;
					}
			   array[0] = 0;
			
		}
		
		for (int value : array)
			if(value != 0)
			{
				System.out.println(value);
			}
	}

}
