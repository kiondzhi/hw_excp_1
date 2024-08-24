//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 9;
        if (num % 2 != 0) {
            throw new ArithmeticException("Число нечетное");
        }
        System.out.println("Число четное");
    }
}