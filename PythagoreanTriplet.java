import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max=a;
        
        if(b>=a){
            max=b;
        } 
        if (c>=a){
            max=c;
        }
        
        if(max==a){
            boolean flag = ((c*c+b*b)==(a*a));
            System.out.println(flag);
        } 
        else if(max==b){
            boolean flag= (c*c+a*a)==(b*b);
             System.out.println(flag);
        }
        else{
           boolean flag= (b*b+a*a)==(c*c); 
            System.out.println(flag);
        }
        
        
      }
    
}
