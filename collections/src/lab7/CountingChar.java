package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
		public static Map charCount(char [] arr) {
		int count,n=0;
		int len=arr.length;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
		char c=arr[i];
		if(map.containsKey(c)) {
		int n1=(int)map.get(c)+1;
		map.put(c, n1);
		}
		else {
		map.put(c, 1);
		}
		}
		return map;
		}

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		char arr[]=new char[str.length()];
		        for(int i=0;i<str.length();i++) {
		        arr[i]=str.charAt(i);
		        }
		        CountingChar obj=new CountingChar();
		        Map map1=obj.charCount(arr);
		         System.out.println(map1);
		}

}
