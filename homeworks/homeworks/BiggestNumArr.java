package homeworks;

import java.util.Scanner;

public class BiggestNumArr {

	public static void main(String[] args) {
				
				  int n;
			        Scanner sc= new Scanner(System.in);
			        System.out.print("Enter no. of elements you want in array:");
			        n = sc.nextInt();
			        int a[] = new int[n];
			        System.out.println("Enter all the elements:");
			        for (int i = 0; i < n; i++) 
			        {
			            a[i] = sc.nextInt();
			        }
			        int temp=a[0];
			        for (int i = 0; i < n; i++) 
			        {
			        	if(temp>=a[i])
						{continue;
						}else
							temp=a[i];	
			        }
			        System.out.println("highest number in the array is " +temp);		
sc.close();

	}

}
