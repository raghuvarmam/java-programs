package homeworks;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
			int a[][] = new int[3][3];
			int sum=0;
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.println("Enter the number ");
					a[i][j] = sc.nextInt();		
				}
			}

			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					sum = sum+a[i][j];
				}
			}
			System.out.println("sum of elements is : "+sum);
			sc.close();
		}

	

}
