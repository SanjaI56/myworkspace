
import java.util.Random;
import java.util.Scanner;

public 
class test{
    Scanner s= new Scanner(System.in);
    Random rand=new Random();// using random number
    int question_random_number,user_answer,mark=0;
    String didqualify;
    public String squareteststart(){
        System.out.println("WELCOME TO SQUARE TESTING ........"
        +"ENTER YOURCHOiCE TO ASK HOW MANY QUESTIONS TO BE ASK "
        +"5 OR 10 ");
        int noofquestions=s.nextInt();
        if(noofquestions==5){// 5 questions on square test
            for(int i=1;i<=noofquestions;i++){
                question_random_number=rand.nextInt(31);
                System.out.println("Question "+i+" ) "+question_random_number);
                user_answer=s.nextInt();
                if(user_answer==(question_random_number*question_random_number)){
                    mark+=1;
                }else{
                    mark=mark;
                }
            }
            if(mark>=3){
                System.out.println("YOU PASSED THE TEST.."
                +"AND YOUR SCORE => "+mark+" / "+noofquestions);
                didqualify="QUALIFIED IN SQUARING";
            }else{
                System.out.println("SORRY TO SAY THAT YOU HAVEN'T PASSED THIS TEST "
                +"AND YOUR SCORE => "+mark+"/"+noofquestions);
                didqualify="NOT QUALIFIED";
            }

            
        }
        if(noofquestions==10){//10 questions for square test
           for(int i=1;i<=noofquestions;i++){
                question_random_number=rand.nextInt(31);
                System.out.println("Question "+i+" ) "+question_random_number);
                user_answer=s.nextInt();
                if(user_answer==(question_random_number*question_random_number)){
                    mark+=1;
                }else{
                    mark=mark;
                }
            }
             if(mark>=7){
                System.out.println("YOU PASSED THE TEST.."
                +"AND YOUR SCORE => "+mark+" / "+noofquestions);
                didqualify="QUALIFIED IN SQUARING";
            }else{
                System.out.println("SORRY TO SAY THAT YOU HAVEN'T PASSED THIS TEST "
                +"AND YOUR SCORE => "+mark+"/"+noofquestions);
                didqualify="NOT QUALIFIED";
            }
        }
        return didqualify;
   }
   public String cubicteststart(){

        System.out.println("WELCOME TO CUBIC TESTING ........"
        +"ENTER YOURCHOiCE TO ASK HOW MANY QUESTIONS TO BE ASK "
        +"5 OR 10 ");
        int noofquestions=s.nextInt();
        if(noofquestions==5){// 5 questions for cubic test
            for(int i=1;i<=noofquestions;i++){
                question_random_number=rand.nextInt(21);
                System.out.println("Question "+i+" ) "+question_random_number);
                user_answer=s.nextInt();
                if(user_answer==(question_random_number*question_random_number*question_random_number)){
                    mark+=1;
                }else{
                    mark=mark;
                }
            }
            if(mark>=3){
                System.out.println("YOU PASSED THE TEST.."
                +"AND YOUR SCORE => "+mark+" / "+noofquestions);
                didqualify="QUALIFIED IN CUIBIFING";
            }else{
                System.out.println("SORRY TO SAY THAT YOU HAVEN'T PASSED THIS TEST "
                +"AND YOUR SCORE => "+mark+"/"+noofquestions);
                didqualify="NOT QUALIFIED";
            }
        
        }
        if(noofquestions==10){//10 questions for cubic test
           for(int i=1;i<=noofquestions;i++){
                question_random_number=rand.nextInt(21);
                System.out.println("Question "+i+" ) "+question_random_number);
                user_answer=s.nextInt();
                if(user_answer==(question_random_number*question_random_number*question_random_number)){
                    mark+=1;
                }else{
                    mark=mark;
                }
            }
             if(mark>=7){
                System.out.println("YOU PASSED THE TEST.."
                +"AND YOUR SCORE => "+mark+" / "+noofquestions);
                didqualify="QUALIFIED IN CUBIFING";
            }else{
                System.out.println("SORRY TO SAY THAT YOU HAVEN'T PASSED THIS TEST "
                +"AND YOUR SCORE => "+mark+"/"+noofquestions);
                didqualify="NOT QUALIFIED";
            }
        }
       return didqualify;
   }

    
}
