/*
1. Создайте приложение, которое покажет, что для 
выражения a^n+b^n=c^n (теорема Ферма) нет натуральных решений от 1 до 100 и n>2. 
Убедитесь, что есть решения для n=2, и выведите их в консоль.
 */
package Lab4;
import java.util.Scanner;
/**
 * @author SimonSS
 */
public class Zadanie1 {
   public static void main(String[] args){
     int a,b,c,n;
     boolean tr = false;
     Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i = 1;i<100;i++){
        for(int j=1;j<100;j++){
            for(int k=1;k<100;k++){
            a =(int) Math.pow(i, n);
            b =(int) Math.pow(j, n);
            c =(int) Math.pow(k, n);
            if (a+b == c){
                System.out.println(i+"^"+n+"^"+"+"+j+"^"+n+"="+k+"^"+n);
                tr = true;
            }
          
            }
        }
   }
   if (tr == false)
   { System.out.print("Решений нет");}
            }
   }
