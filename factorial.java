package assignment_question;
import java.util.Scanner;
public class factorial {
    static void main() {
        Scanner sc= new Scanner (System.in);
        int n, fact=1;
        System.out.println("Enter a number");
        n= sc.nextInt();

        for(int i=1;  i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial"+fact);
    }
}


