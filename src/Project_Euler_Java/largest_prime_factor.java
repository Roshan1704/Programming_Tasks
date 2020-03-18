// # Find the largest prime factor of any number.

package Project_Euler_Java;

import java.util.Scanner;

public class largest_prime_factor 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		long a=s.nextLong();
		s.close();
		long temp= a;
		int m=2;
		
		for(int i=0;i<a/2;i++)
		{
			if(temp%m==0)
			{
				temp=temp/m;
				
			}
			else if(temp==i)
			{
				break;
			}
			else
			{
				m++;
			}
		}
		System.out.println("The largest prime factor is = " + temp);

	}

}
