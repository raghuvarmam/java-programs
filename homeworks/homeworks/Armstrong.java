package homeworks;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0;
		int num=153;
		int temp=num;
		while(num!=0){
			rem = num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if( temp==sum)
			System.out.println(" it is an armstrong num");

	}

}
