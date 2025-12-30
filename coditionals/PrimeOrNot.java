import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        if (a%a==0 && a%1==0) {
            System.out.println("The number is Not Prime !!");  
        }
        else {
            System.out.println("The number is Prime !!");
        }
    }
}
// it is not correct ....... kahin to error hai