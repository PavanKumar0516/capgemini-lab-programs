package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayEle {
	public int[]  Reverse(int[] arr) {
		String[] strarr=new String[arr.length];
		int l=0;
		int arr3[] = new int[arr.length];
		for(Integer i : arr) {
		String str=i.toString();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		String str1=sb.toString();
		strarr[l]=str1;
		l++;
		}
		Arrays.sort(strarr);
		int n = 0;
		for (String s : strarr) {
		int val = Integer.valueOf(s);
		arr3[n] = val;
		n++;
		}
		
	return	arr3;
	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of Elememts:");
		int n = scan.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter Elememts:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		ReverseArrayEle obj=new ReverseArrayEle();
		obj.Reverse(arr);
		/*for(int i:array) {
			System.out.println(i);
		}*/

	}

}