package assignment_question;
import java.util.Scanner;
public class even_or_not {
    static void main() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}


