import java.util.Scanner;
public class IT24102551Lab5Q2
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter the number of new member introduced: ");
        num=input.nextInt();

        switch(num)
        {
            case 0:
                System.out.print("No Prize");
                break;
            case 1:
                System.out.print("Prize is a: Pen");
                break;
            case 2:
                System.out.print("Prize is a: Umbrella");
                break;
            case 3:
                System.out.print("Prize is a: Bag");
                break;
            case 4:
                System.out.print("Prize is a: Travelling Chair");
                break;
            default:
                if(num>=5)
                {
                     System.out.print("Prize is a: Headphone");
                }
                else
                {
                    System.out.print("Input must be a number 0 or greater");
                }
                break;

        }
    }
}