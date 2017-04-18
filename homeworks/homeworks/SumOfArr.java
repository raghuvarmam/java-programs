package homeworks;

import java.util.Scanner;

public class SumOfArr {

	public static void main(String[] args) {


		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("Enter the array values");
			a[i] = sc.nextInt();
			sum+=a[i];
		}
		System.out.println("sum of all values in an array is " +sum);
		sc.close();
}}