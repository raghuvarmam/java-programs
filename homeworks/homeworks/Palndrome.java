package homeworks;

public class Palndrome {

	public static void main(String[] args) {
		int rem, rev=0;
		int num=6456;
		int temp=num;
		while(num>0){
			rem= num%10;
			rev= rev*10+rem;
			num=num/10;
			//sum+=rem;
		}
		if(temp==rev)
			System.out.println(temp+" is palindrome");
		else
			System.out.println("not a palindrome");

	}

}
