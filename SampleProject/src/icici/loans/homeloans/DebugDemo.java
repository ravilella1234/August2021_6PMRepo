package icici.loans.homeloans;

import java.util.Scanner;

public class DebugDemo 
{
	
	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of the array is : "+ sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		DebugDemo obj = new DebugDemo();
		int count = obj.m1();
		System.out.println("Count of the array is : " + count);
	}

}
