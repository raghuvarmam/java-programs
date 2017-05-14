package exception.handling;

import java.util.Random;

public class TestExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		Random r= new Random();

			try{
				for(int i=0;i<10;i++){
				b=r.nextInt();
				c=r.nextInt();
				a=1234/(b/c);
				System.out.println(a);
				}
			}catch(ArithmeticException e){
				a=0;
				System.out.println("division by zero value of a is "+a);
			}
		System.out.println("a :"+a);
	}

}


