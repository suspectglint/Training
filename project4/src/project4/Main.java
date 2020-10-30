package project4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int pos,i;
		int num[] = new int[10];
		Scanner sc = new Scanner(System.in);
        for(i=0;i<num.length;i++)
        {
        	num[i]=sc.nextInt();
        }
        System.out.println("Enter a position");
        pos = sc.nextInt();
        try
        {
        	System.out.println("The number is "+num[pos]);
        }
        catch(ArrayIndexOutOfBoundsException ioe)
        {
        	System.out.println("Invalid position! Please enter a valid position");
        }
	}

}
