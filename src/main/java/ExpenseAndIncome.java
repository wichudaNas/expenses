public class ExpenseAndIncome {
    private double money;
    private double income;
    private double expense;

    public ExpenseAndIncome() {
        this.money = money;
        this.income = income;
        this.expense = expense;
    }

    public void pay_Money(double expense) {

        this.money = money - expense;
    }
    public void add_Money(double income) {

        this.money = money + income;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    public double getMoney() {
        return money;
    }
}
