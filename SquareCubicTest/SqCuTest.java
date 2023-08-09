import java.util.Scanner;

public class SqCuTest {
    public static void main(String[] args) {
    while(true){
    Scanner s=new Scanner(System.in);
    System.out.println();
    System.out.println(" TEST BEGINS:!!!!!!!!!!"
    +"ENTER YOUR CHOICE (1) SQUARING TEST || (2) CUBIC TEST  ||  "
    +"(q) FOR QUIT... "
    );
    int choice= s.nextInt();
    test teststart=new test();
    if(choice==1){
        teststart.squareteststart();
    }else if(choice==2){
        teststart.cubicteststart();
    }
    else{
        
        System.out.println("you have given wrong choice kindly check and re-choice it......"+
        "if you what to quit : Enter 'q' ");
        if(choice=='q' || choice=='Q'){
            break;
        }
    }
    }
}
}
