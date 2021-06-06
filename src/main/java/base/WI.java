package base;

public class WI extends State{
    @Override
    public void output(Integer amount) {
        float subtotal = amount;
        double tax = .055 * subtotal;
        double total = subtotal + tax;
        System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f.", subtotal, tax, total);
    }
}
