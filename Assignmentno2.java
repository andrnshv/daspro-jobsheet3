import java.util.Scanner;

public class Assignmentno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of hours: ");
        //to input the nomber of hour worked
        double workHours = input.nextDouble();
        //to reads input the number of hour worked
        System.out.print("Input the hour wages:");
        //to input the hour wages
        double hourWages = input.nextDouble();
        //to reads the hour wages

        double salaryBeforeBonus = workHours * hourWages;
        //to count the salary before bonus is number of hours multiply with hour wages
        double bonus = salaryBeforeBonus * 0.10;
        //to count the bonus, is 10% of salary before bonus
        double totalBeforeTaxes = salaryBeforeBonus + bonus;
        //to count the salary after included with bonus
        double taxes = totalBeforeTaxes * 0.05;
        //to count the taxes is 5% of salary after included with bonus
        double totalSalary = totalBeforeTaxes - taxes;
        //to count the total salary. Salary that have included with bonus is reduced by taxes

        System.out.println("Base Salary:" + salaryBeforeBonus);
        //print of monthly salary without bonus and not reduced by taxes
        System.out.println("Bonus: " + bonus);
        //print output of bonus
        System.out.println("Taxes: "+ taxes);
        //print output of taxes
        System.out.print("Total salary of employee " + totalSalary);
       //print output of employee's total salary 
    }
}


