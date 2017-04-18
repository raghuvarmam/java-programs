package homeworks;

public class OperationsUsingClasses {

	public static void main(String[] args) {

		operations a1 = new operations();
		a1.insert(4, 5);
		a1.add();
		a1.sub();
		
		operations a2 = new operations();
		a2.insert(9, 4);
		a2.sub();
		a2.add();

		operations a3 = new operations();
		a3.insert(2, 8);
		a3.mul();
		
		operations a4 = new operations();
		a4.insert(10, 5);
		a4.div();

	}

}
class operations{
	int a,b;
	void insert(int x,int y){
		a=x;
		b=y;
	}
	void add(){
		System.out.println("add = " +(a+b));
	}
	void sub(){
		System.out.println("sub= "+(a-b));
	}
	void mul(){
		System.out.println("mul= "+(a*b));
	}
	void div(){
		System.out.println("div= "+(a/b));
	}
}
