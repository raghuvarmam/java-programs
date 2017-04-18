package homeworks;
import java.util.Scanner;

public class BigEvenArray {

	public static void main(String[] args) {

		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for( int i = 0 ; i < size ; i++ ){
			System.out.println("enter the "+ (i+1) + " number");
			a[i] = sc.nextInt();
		}
		int temp;
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
		int counter=0;
		for ( int i = size -1; i >= 0 ; i--)
		{
			if(a[i] % 2 == 0)
			{
				counter++;
			}
			if (counter == 2)
			{
				System.out.println("second biggest number is: "+a[i]);
				break;
			}
		}
		if(counter < 2)
		{
			System.out.println("there is no second biggest even number");
		}
		sc.close();
	
	}

}
