import java.util.Scanner;
public class first_java_assign{
    public static void main(String[] args) {
        int sum=0 ,i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 NO. ");
        int n =5;
        while(i<n){
            System.out.println("Enter integer ");
           sum = sum + input.nextInt();
           i++;
        }
        System.out.println("Summation is "+sum);
    }
}
