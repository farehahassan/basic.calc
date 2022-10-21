import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Press:\n + for addition \n - for subtraction \n * for multiplication / for division \n % for remainder");
        double sum=a+b;
        double sub= a-b;
        double multp= a*b;
        double divi = a/b;
        double rem = a%b;

        char op = sc.next().charAt(0);
        if( op == '+'){
        System.out.println("sum is :"+sum);
        } else if ( op == '-'){
            System.out.println("sub is: "+ sub);

        } else if ( op == '*'){
            System.out.println("multiplication is: "+ multp);
        } else if ( op == '/'){
            System.out.println("division is: "+ divi);
        } else if ( op == '%'){
            System.out.println("remainder is: "+ rem );
        } 
        else 
        System.out.println("You entered wrong operator:");
    }
}
