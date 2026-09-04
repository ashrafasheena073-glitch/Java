import  java.util.Scanner;
public class calculator {
     public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number:");
        int num1= sc.nextInt();
        System.out.print("Enter second number:");
        int num2= sc.nextInt();
       System.out.print("enter operator:");
        char opt = sc.next().charAt(0);
        if (opt=='+'){ 
        int sum= num1 + num2;
        System.out.println("Sum is:" +sum );}
        else if (opt=='*'){ 
        int mul= num1 *num2;
        System.out.println("Mulltipication is " +mul );}
        else if (opt=='-'){ 
        int sub = num1 -num2;
        System.out.println("Subtraction is " +sub );}
else if(opt=='/'){
        int div = num1/num2;
        System.out.println("Division is:" +div);}
        else if (opt=='%'){
        int mod= num1%num2;
        System.out.println("modulus is:" +mod);}
                else 
                        System.out.println("Invalid operator");
                sc.close();
        }
}











