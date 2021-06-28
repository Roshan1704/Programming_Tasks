package Misc_program.src;

import java.util.Scanner;

public class reverse_String {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter the String : ");  
		String name= sc.nextLine();
		System.out.println("For 'BufferString' way press '1' for char way press any other number");  
		System.out.println("1 or any othe number? : ");
		int a= sc.nextInt();  
		//String name="my name is roshan";
		int len=name.length();
		int k=0;
		String str;
		System.out.println("Sting is : "+ name);
		if(a==1)
		{
			StringBuffer sb= new StringBuffer(name);
			StringBuffer sb2= sb.reverse();
			str= sb2.toString();
			//System.out.println(ss);
		}
		else
		{
			char ch[] = new char[len]; 
			for(int j=len-1;j>=0;j--)
			{
				ch[k]= name.charAt(j);
				k++;
				//System.out.println(ch[j]);
			}
			str = String.valueOf(ch);
		}
		
		//System.out.println(ch);
		
		//System.out.println(str);
		String str_arr[]= str.split(" ");
		System.out.print("Reverse Sting is : ");
		for(int i=(str_arr.length-1) ; i>=0; i--)
		{
			System.out.print(str_arr[i]);
			System.out.print(" ");
		}

}
}
