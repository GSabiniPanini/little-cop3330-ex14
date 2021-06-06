package base;

public class State {
    public String output(Integer amount) {
        float minitotal = amount;
        String total = String.format("%.2f", minitotal);
        String msg = ("The total is $" + total + ".");
        return msg;
    }
}
