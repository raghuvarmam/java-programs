package homeworks;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {

			System.out.println("enter the size of array");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int a[] = new int[size];
			for( int i = 0 ; i < size ; i++ ){
				System.out.println("enter the "+ (i+1) + " number");
				a[i] = sc.nextInt();
			}
			secondBiggest(a,size);
			sc.close();
		}
		public static void secondBiggest(int a[],int size)
		{int temp;
		for(int i = 0 ; i < size ; i++){
			for(int j=i+1;j<size;j++){
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after sorting array");
		System.out.print("a[]= { ");
		for(int i=0;i<size;i++)
			System.out.print(a[i] + ",");
		System.out.print(" }");

		System.out.println("\nSecong highest number is :"+a[size-2]);

	}
	}


