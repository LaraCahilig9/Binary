package LaraBSIS;

import java.util.Scanner;


public class Binarytodecimal {

  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a 6-bit binary number");
    int num = in.nextInt();
    
    int decimal=0;
    int bit;
    
    int i=0;
    int power2=1;
    int len=num;
    while (i<len) {
            bit=len%10;
            decimal=decimal+bit*power2;
            len=len/10;
            power2 = power2 + bit * (int) Math.pow(2,i++);
            
            
            System.out.println("Decimal Equivalent of "+num+" is " +power2);
           
            
            
            
    }
    
  }

}
