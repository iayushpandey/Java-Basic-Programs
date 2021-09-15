import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int or1= n1;
        int or2= n2;
        
        while(n1 % n2 !=0){
            int rem= n1 % n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        int lcm = (or1*or2)/gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
           
       }
}
