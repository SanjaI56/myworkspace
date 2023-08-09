import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of random number to be display: 1<------>100");
	int n=s.nextInt();
	int r_no;
	Random rand=new Random();
	for(int i=1;i<=n;i++) {
		r_no=rand.nextInt(101);
		System.out.print("----->"+r_no+"  ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
