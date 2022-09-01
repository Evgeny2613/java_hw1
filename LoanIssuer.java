package lesson1.credit;

public class LoanIssuer {

    private String firstName;
    private String lastName;
    private boolean isLazy;
    private boolean isKind;


    public LoanIssuer(String firstName, String lastName, boolean isLazy, boolean isKind) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isKind = isKind;
        this.isLazy = isLazy;
    }

    // если работник ленивый, он одобрит кредит если доход заемщика не меньше 20_000 евро в год
    // если работник не ленивый но добрый, он одобрит кредит если доход не меньше 25000 и клиенту меньше 60 лет
    // если работник не ленивый и злой, то он одобрит кредит если доход не меньше 27000 и клиенту не больше 50 лет


    public boolean toIssue(LoanTaker client) {
        if (isLazy == true && client.getYearlyIncome() >= 20_000)
            return true;
        else if (isLazy == false && isKind == true && client.getYearlyIncome() >= 25_000 && client.getAge() < 60)
            return true;
        else if (isLazy == false && isKind == false && client.getYearlyIncome() >= 27_000 && client.getAge() <= 50)
            return true;
        else
            return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }
}
