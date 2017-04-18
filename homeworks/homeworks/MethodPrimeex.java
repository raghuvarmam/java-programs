package homeworks;

import java.util.Scanner;

public class MethodPrimeex {

	public static void main(String[] args) {

		System.out.println("Enter the number to check wether it is prime number or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
		
		sc.close();
	}
	public static void prime(int a)
	{
		int ch=0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				System.out.println(a + " number is  not a prime number");	
				ch=1;
				break;
			} 
		}
		if(ch==0)
			System.out.println(a +" number is  a prime number");
	}
	}


