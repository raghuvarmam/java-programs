package homeworks;
import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {

		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter " +size+" numbers");
		for( int i = 0 ; i < size ; i++ ){
			a[i] = sc.nextInt();
		}
		int counter=0;
		System.out.print("prime numbers are : ");
		for(int j=0;j<size;j++){
			int	n= a[j];
			int ch=0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					ch=1;
				} 
			}
			if(ch==0){
				System.out.print(n +" ");
				counter++;
			}
		}
		System.out.println("\ntotal prime numbers in array: "+ counter);
		sc.close();
	}



}

