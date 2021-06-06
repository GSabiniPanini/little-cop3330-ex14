package base;

public class WI extends State{
    @Override
    public String output(double amount) {
        double subtotal = amount;
        double tax = .055 * subtotal;
        double total = subtotal + tax;
        String stringsubtotal = String.format("%.2f", subtotal);
        String msg = ("The subtotal is $" + stringsubtotal + ".\nThe tax is $" + tax + ".\nThe total is $" + total + ".");
        return msg;
    }
}
