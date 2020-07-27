package lab7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSquare {

		public static Map getSquare(int  arr[]) {
			//int arr1[]=new int[arr.length];
			Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
			for(int i=0;i<arr.length;i++) {
				map.put(arr[i], arr[i]*arr[i]);
			}
			
			return map;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int number=scan.nextInt();
			int arr[]=new int[number];
			for(int i=0;i<number;i++) {
				int number1=scan.nextInt();
				arr[i]=number1;
			}
			Map <Integer,Integer> map=MapSquare.getSquare(arr);
			System.out.println(map);
			
		}

	}