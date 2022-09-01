import lesson1.credit.LoanIssuer;
import lesson1.credit.LoanTaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoanTest {
    @Test
    public void case1() {
        LoanTaker client = new LoanTaker("Igor", "Sokolovsky", 45, 25_000);
        LoanIssuer issuer = new LoanIssuer("Ivan", "Petrov", true, true);
        assertEquals(true, issuer.toIssue(client));
    }


    @Test
    public void case2() {
        LoanTaker client = new LoanTaker("Artem", "Rebrov", 50, 30_000);
        LoanIssuer issuer = new LoanIssuer("Masha", "Kutz", false, false);
        assertEquals(true, issuer.toIssue(client));
    }
}
