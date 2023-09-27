import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        BOB bob = new BOB();
        bob.getRateofInterest();
        bob.setter();

    }
}

abstract class Bank {
    float amount;
    float i;
    float total_i;
    float month;
    final float interest = 9.9f;
    float n;
    float year;
    Scanner scanner = new Scanner(System.in);

    abstract public void getRateofInterest();

    abstract public void setter();
}

class BOB extends Bank {

    public void getRateofInterest() {
        System.out.print("Enter Month EMI = ");
        amount = scanner.nextFloat();
        System.out.print("How Manny Years EMI Interest = ");
        n = scanner.nextFloat();
        i = amount * interest / 100;
        month = amount + i;
        year = month * 12;
        total_i = i * 12;
        n = n * year;

    }

    public void setter() {
        System.out.println("Monthly with Interest Amount = " + month);
        System.out.println("One Year with Interest Amount = " + year);
        System.out.println("One Year Interest onluy = " + total_i);

        System.out.println("***********************************");

        System.out.println("Your Home Loan Total Year Amount = " + n);

    }

}