import java.text.NumberFormat;
/**
 *
 * @author Bill Kraynek
 */
public class ClassExampleOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount = 200;
        double rate = .03;
        int years = 5;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("The amount is " + currency.format(amount));
        System.out.println("The rate is " + rate);
        System.out.println("The years is " + years);
        double total = amount * (1 + rate);
        System.out.println("The total after one year is " + currency.format(total));
        total = amount * Math.pow(1 + rate, years);
        System.out.println("The total after " + years + " years is " + currency.format(total));
        total = amount * Math.pow(1 + rate / 12, 12);
        System.out.println("The total after one year compounding monthly is " + currency.format(total));
        total = amount * Math.pow(1 + rate / 12, years * 12);
        System.out.println("The total after " + years + " years compounding monthly is " + currency.format(total));
        total = amount * Math.pow(1 + rate / 365, 365);
        System.out.println("The total after one year compounding daily is " + currency.format(total));
        total = amount * Math.pow(1 + rate / 365, years * 365);
        System.out.println("The total after " + years + " years compounding daily is " + currency.format(total));
        total = amount * Math.pow(1 + rate, 1);
        total += amount * Math.pow(1 + rate, 2);
        total += amount * Math.pow(1 + rate, 3);
        total += amount * Math.pow(1 + rate, 4);
        total += amount * Math.pow(1 + rate, 5);
        System.out.println("The total after investing the amount each year for 5 years is " + currency.format(total));
    }
}
