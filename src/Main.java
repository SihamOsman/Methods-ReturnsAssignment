//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double payment = 200;
        System.out.println("Saving account updated.New balance:$" + fundAccount(50000 + payment, 600 + payment, 7000));

    }

    public static double fundAccount(double savingsAccountBalance, double indexFundBalance, double depositAmount) {
        if (savingsAccountBalance >= 50000) {
            return depositAmount + indexFundBalance;
        } else {
            return savingsAccountBalance;
        }
    }
}
