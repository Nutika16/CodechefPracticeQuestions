/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //new users
		int a=sc.nextInt(); //didn't make any submission
		int b=sc.nextInt(); //made submission but wrong answer
		int rating=n-a;
		int tried=rating-b;
		System.out.print(rating+" ");
		System.out.println(tried);
		
	}
}
