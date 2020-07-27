package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medals {

	public static Map getStudent(HashMap<Integer, Integer> map){
		Map<Integer, String> map2=new HashMap<>();
		String s=null;
		    for (Integer i : map.keySet()) {
		int num=map.get(i);
		if(num>=90) {
		s="Gold";
		}
		else if(num>=80 || num<90){
		s="silver";
		}
		else if(num>=70 || num<80){
		s="Bronze";
		}
		map2.put(i, s);
		}
		return map2;
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		        for (int i = 0; i < n; i++) {
		        System.out.println("Enter id:");
		        int n2=sc.nextInt();
		        System.out.println("Enter marks:");
		        int n3=sc.nextInt();
		        map.put(n2, n3);
		}
		       Map map1= Medals.getStudent((HashMap<Integer, Integer>) map);
		       System.out.println(map1);
		}

		}