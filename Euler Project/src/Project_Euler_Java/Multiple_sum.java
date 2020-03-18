package Project_Euler_Java;

import java.util.Scanner;

public class Multiple_sum {

	public static void main(String[] args)
	{
		long sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("how many Divisors you wanna enter");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the divisor " + (i+1));
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the lower limit");
		int a=s.nextInt();
		System.out.println("Enter the upper limit");
        int b=s.nextInt();
        for(int i=0;i<n;i++)
        {
        	for(int j=a;j<b;j++)
        	{
        		if(j%arr[i]==0)
        		{
        			sum= sum+j;
        		}
        	}
        }
        System.out.println("Total sum of all the  mutiple is"+sum);
        s.close();
	}
}
