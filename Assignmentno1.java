import java.util.Scanner;

public class Assignmentno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the Electricity Usage (in kWh): ");
        //to prints input the electricity usage from user's input
        double electricityUsage = input.nextDouble();
        //variable for usage of electricity
        double electricityTariff = 1500;
        //variable for Electricity Tariff

        double electricityBill = electricityTariff * electricityUsage;
        //variable to count Electricity BIll are Electricity Tariff  multiply with Electricity Usage
        boolean exceeds = electricityUsage >= 500;
        //variable if electricity usage more than 500, the results is true. if not, the results is false

        System.out.println("Total Electricity Bill: Rp " + electricityBill);
        //to prints output Total Electricity Bill with calling a variable of Electricity Bill
        System.out.println("Is it exceeds 500kWh? " + exceeds);
        //to prints output confirmation of exceeds 500kWh or not with calling a variable of exceeds
    }
}


