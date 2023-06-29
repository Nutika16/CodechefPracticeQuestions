
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
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt(); //stock 
		    int y=sc.nextInt(); //sold
		    if(y>x){
		        System.out.println("PROFIT");
		    }
		    else if(x==y){
		        System.out.println("NEUTRAL");
		    }
		    else{
		        System.out.println("LOSS");
		    }
		}
	}
}
