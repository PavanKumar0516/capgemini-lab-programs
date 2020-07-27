package lab7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SecondSmall {

		public static int secondSmallest(int [] arr) {
			Integer arr1[]=new Integer[arr.length];
			for(int i=0;i<arr.length;i++) {
				arr1[i]=Integer.valueOf(arr[i]);
			}
			
			List<Integer>lis=Arrays.asList(arr1);
			Collections.sort(lis);
			int ele=lis.get(1);
			return ele;
			}
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			int arr[] = new int[number];
			for (int i = 0; i < number; i++) {
				int number1 = scan.nextInt();
				arr[i] = number1;
			}
			int num2=SecondSmall.secondSmallest(arr);
			System.out.println(num2);
		}

	}