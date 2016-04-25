/**
 * Created by Pavilion on 22-4-2016.
 */
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
//        int total = 0;
//        int score = 7;
//
//        if (score == 7)
//            System.out.println("your score is touchdown");
//
//        if (score == 3)
//            System.out.println("you kick a field goal");
//
//        total=total+score;
//        System.out.println("total score is "+score);
//        }
//    }


                Scanner bucky = new Scanner(System.in);
        int number, number1, number2;
        int sum =0;

        System.out.println("enter the first number");

        number = bucky.nextInt();

        System.out.println("enter your second number");
        number1 = bucky.nextInt();


        System.out.println("enter your third number");
        number2 = bucky.nextInt();
        sum=number+number1+number2;
        if(sum==6){
            System.out.println("wrong answer");
            sum++;

        }

        System.out.println("the sum is " +sum );


    }




}



