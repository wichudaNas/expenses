import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import static org.junit.jupiter.api.Assertions.*;



public class stepDefExpense {
    ExpenseAndIncome ex;


    @Before
    public void init(){
        ex = new ExpenseAndIncome() ;


    }
    @Given("a customer add expense (.*) bahts")
    public void a_customer_add_expense(double money){
        ex.pay_Money(money);
    }
    @Given("a customer add income (.*) bahts")
    public void a_customer_add_incmoe(double money) {
        ex.add_Money(money);
    }
    @When("a customer expense (.*) bahts")
    public void a_customer_expense(double money){
        ex.pay_Money(money);
    }
    @When("a customer income (.*) bahts")
    public void a_customer_income(double money){
        ex.add_Money(money);
    }
    @When("a customer view expense")
    public void a_customer_view_expense(){
        ex.getExpense();
    }
    @When("a customer view income")
    public void a_customer_view_income(){
        ex.getIncome();
    }
    @Then("amount of money is (.*) bahts")
    public void amount_of_money(double money){
        assertEquals(money,ex.getMoney());

    }

   @Then("an expense is (.*) bahts and amount of money is (.*)")
    public void an_expense_and_amount_money(double expense, double money){
        assertEquals(expense,ex.getExpense());
        assertEquals(money,ex.getMoney());

   }
   @Then("an income is (.*) bahts and amount of money is (.*)")
    public void an_income_and_amount_money(double income, double money){
       assertEquals(income,ex.getIncome());
       assertEquals(money,ex.getMoney());


   }



}
