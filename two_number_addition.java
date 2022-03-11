
package com.mycompany.task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.print("enter first binary number:");
        int n1=input.nextInt();
        System.out.print("enter second binary number:");
        int n2=input.nextInt();
        int result_n1=0,result_n2=0,reminder=0,i=0,j=0;
        //convert binary num1 to decimal
        while(n1!=0)
        {
            reminder=n1%10;//0 1
            result_n1+=(Math.pow(2, i)*reminder);
            n1/=10;//1
            i++;
        }
        //convert binary num2 to decimal
        while(n2!=0)
        {
            reminder=n2%10;//0 1
            result_n2+=(Math.pow(2, j)*reminder);
            n2/=10;//1
            j++;
        }
        //sum of two decimal number
        int sum_d=result_n1+result_n2;
        String result="";
        //convert decimal num to binary
        while(sum_d!=0)
        {
            reminder=0;
            reminder=sum_d%2;
            result+=reminder;
            sum_d/=2;
        }
        result+=0;
        System.out.println("sum of two binary numbers:"+result);
    }
}