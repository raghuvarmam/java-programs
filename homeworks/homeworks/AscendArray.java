package homeworks;

import java.util.Scanner;

public class AscendArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter  5 values");
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for (int i=0;i<a.length;i++) 
        {
            for (int j=i+1;j<a.length;j++) 
            {
                if (a[i]>a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.print("Ascending Order:");
        for (int i=0;i<a.length;i++) 
        {
            System.out.print(a[i]+"," );
        }sc.close();
        // System.out.println("second highest is " +a[a.length-2]);

}
	}
