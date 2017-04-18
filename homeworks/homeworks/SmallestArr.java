package homeworks;

public class SmallestArr {

	public static void main(String[] args) {

		int a[] = {1,2,4,3};
		int temp=a[0];
		for(int i=0;i<a.length;i++){
			if(temp<=a[i])
			{continue;
			}else
				temp=a[i];		
		}System.out.println("smallest value is " +temp);
	}

}
