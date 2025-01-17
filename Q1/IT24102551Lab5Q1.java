import java.util.Scanner;
public class IT24102551Lab5Q1
{
    public static void main(String[] args)
    {
        int number1,number2,number3;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1=input.nextInt();
        System.out.print("Enter the second number: ");
        number2=input.nextInt();
        System.out.print("Enter the third number: ");
        number3=input.nextInt();
        
        System.out.println(" ");

        System.out.println("User entered numbers are: "+number1+" "+number2+" "+number3);

        if(number1<number2 && number1<number3)
        {
            System.out.println("The smallest number is: "+number1);
        }
        else if(number2<number1 && number2<number3)
        {
            System.out.println("The smallest number is: "+number2);
        }
        else if(number3<number1 && number3<number2)
        {
            System.out.println("The smallest number is: "+number3);
        }
      
        if(number1>number2 && number1>number3)
        {
            System.out.println("The largest number is: "+ number1);
        }
        else if(number2>number1 && number2>number3)
        {
             System.out.println("The largest number is: "+ number2);
        }
        else if(number3>number1 && number3>number2)
        {
             System.out.print("The largest number is: "+ number3);
        }



    }
}