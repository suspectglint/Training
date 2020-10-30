package project5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
/*		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Pune");
		cityList.add(3,"Bangalore");
		cityList.remove(1);
		System.out.println(cityList.size());
		for(String x : cityList)
			System.out.println(x);*/
/*		HashSet<String> cityList = new HashSet<String>();
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Pune");
		//cityList.add(3,"Bangalore");
		//cityList.remove("Delhi");
		System.out.println(cityList.size());
		for(String x : cityList)
			System.out.println(x);		*/
		TreeSet<String> cityList = new TreeSet<String>();
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Pune");
		cityList.add("Bangalore");
		cityList.add("Delhi");
		//cityList.remove("Delhi");
		System.out.println(cityList.size());
		for(String x : cityList)
			System.out.println(x);					
	}

}
