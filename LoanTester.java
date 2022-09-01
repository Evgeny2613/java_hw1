package lesson1.credit;

public class LoanTester {
    public static void main(String[] args) {
        LoanTaker client = new LoanTaker("Igor", "Sokolovsky", 45, 25_000);
        LoanIssuer issuer = new LoanIssuer("Ivan", "Petrov", true, true);

        System.out.println(issuer.toIssue(client));
    }
}
