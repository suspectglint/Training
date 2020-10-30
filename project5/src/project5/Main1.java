package project5;

import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(180);
		ts.add(450);
        ts.add(360); 
        ts.add(10);
        ts.add(120);
        ts.add(610);
        for(Integer I : ts)
        {
        	int i = I;
        	if(i<150)
        		System.out.println(I);
        }
	}

}
