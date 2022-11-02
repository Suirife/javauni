/*
вычисляем значение выражениея с использовангием оператора условия 
*/
package Lab4;
import java.util.Scanner;
/**
 * Simon
 */
public class Zadanie2 {
       public static void main(String[] args){
           int n ;
           float result = 0;
           Scanner sc = new Scanner(System.in);
           n = sc.nextInt();
              if (n < 0) {
              System.out.print("Error n is negative");
                     break;
              }
           for (int i = 1; i<=n; i++){
               if((i%2)==0){
                   result -=1/i;    
               }
               else {
                   result += 1/i;
               }
           }
           System.out.print(result);
       }
}
