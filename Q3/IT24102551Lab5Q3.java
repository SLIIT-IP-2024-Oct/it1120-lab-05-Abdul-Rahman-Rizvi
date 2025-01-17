import java.util.Scanner;

public class IT24102551Lab5Q3
    {
  
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final double DISCOUNT_3_4_DAYS = 0.10; 
    private static final double DISCOUNT_5_OR_MORE_DAYS = 0.20; 

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int sDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int eDate = input.nextInt();

     
        if (sDate < 1 || sDate > 31 || eDate < 1 || eDate > 31) 
        {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }

      
        if (sDate >= eDate) 
        {
            System.out.println("Error: Start date must be less than End Date");
            return; 
        }

     
        int daysReserved = eDate - sDate;

       
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

      
        if (daysReserved >= 3 && daysReserved <= 4) 
        {
            totalAmount -= totalAmount * DISCOUNT_3_4_DAYS; 
        } 
            else if (daysReserved >= 5) 
        {
            totalAmount -= totalAmount * DISCOUNT_5_OR_MORE_DAYS; 
        }

      
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}