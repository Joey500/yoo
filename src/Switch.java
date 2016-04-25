

import java.util.Scanner;
import java.util.*;
/**
 * Created by Pavilion on 23-4-2016.
 */
public class Switch {
    public static void main(String[] args) {
        int grade;
        grade = 5;
        switch (grade) {
            case 1:
                System.out.println("you got A");
                break;
            case 2:
                System.out.println("you got B");
                break;
            case 3:
               System.out.println("you got C");
             break;
           default:
              System.out.println("you got F");
        }
    }
}

