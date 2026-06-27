import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        ArrayList<String> expenses = new ArrayList<>();
        ArrayList<Double> amounts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Expense Name: ");
                    String name = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(name);
                    amounts.add(amount);

                    System.out.println("Expense Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nExpense List:");
                    for (int i = 0; i < expenses.size(); i++) {
                        System.out.println(expenses.get(i) + " - ₹" + amounts.get(i));
                    }
                    break;

                case 3:
                    double total = 0;
                    for (double a : amounts) {
                        total += a;
                    }
                    System.out.println("Total Expense = ₹" + total);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}