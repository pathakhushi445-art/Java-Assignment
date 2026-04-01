package assignment_question;
import java.util.Scanner;
public class Leap_year_or_not {
    static void main() {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");

        n=sc.nextInt();

        if(n%100==0 && n%400==0 || n%100!=0 && n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }

    }
}

