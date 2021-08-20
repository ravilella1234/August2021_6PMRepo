package com.hdfc.loans.eduloans;

public class TwoDimensionArray 
{

	public static void main(String[] args)
	{
		int[][] a= {
					  {1,2,3},
					  {4,5},
					  {7,8,9,10}
		           };
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for(int p[]:a)
		{
			for(int q:p)
			{
				System.out.print(q + "  ");
			}
			System.out.println();
		}
	}

}
