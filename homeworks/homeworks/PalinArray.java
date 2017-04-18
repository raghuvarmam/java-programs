package homeworks;
//import java.util.Scanner;

public class PalinArray {

	public static void main(String[] args) {
		int count=0;
		int a[] = new int[30];
		for( int i = 0 ; i < 30 ; i++ ){
			a[i] = i;
		}
		for(int i=0;i<a.length;i++){

			int rem, rev=0;
			int num=a[i];
			int temp=num;
			while(num>0){
				rem= num%10;
				rev= rev*10+rem;
				num=num/10;
			}
			if(temp==rev){
				count++;
				System.out.print(rev +",");}

		}
		System.out.println("number of palindromes are " + count);

	}
}
