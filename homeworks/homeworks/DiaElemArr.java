package homeworks;

import java.util.Scanner;

public class DiaElemArr {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++){

			System.out.println("Enter " + (i+1) + " array  elements here"  );
			for(int j=0;j<a[i].length;j++){
				a[i][j] = sc.nextInt();		
			}
		}

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i]==a[j])
					sum = sum+a[i][j];
			}
		}
		System.out.println("sum of diagonal elements in the array is : "+sum);
		sc.close();


	}

}
