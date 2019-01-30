package PIE.PIE;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {

    private final InMemoryPointOfSalesIntegratedEnvironment model;

    public SampleTest() {
        model = new InMemoryPointOfSalesIntegratedEnvironment();
    }

    @Test
    public void test1(){
        Branch branch1 = new Branch(1, "Mumbai", "india");
        Branch branch2 = new Branch(1, "delhi", "india");
        model.createBranch(branch1);
        Branch result = model.getbBranch(branch1.branchId);
        assertEquals(branch2, result);
    }

    @Test
    public void testCustomer(){
        Customer customer1 = new Customer(1,"Ritika","NJ","07302",1);
        model.createCustomer(customer1);
        Customer result = model.getCustomer(customer1.id);
        assertEquals(customer1, result);
    }

    public void testTransactionAverage(){
        Transaction transaction1 = new Transaction(1, 1,1,"O");
        Transaction transaction2 = new Transaction(2, 1,1,"O");
        model.createTransaction(transaction1);
        model.createTransaction(transaction2);
        OrderLine orderline1 = new OrderLine(1, 20);
        OrderLine orderLine2 = new OrderLine(2,30);
        OrderLine orderline3 = new OrderLine(3,10);
        model.addOrderLineToTransaction(1,orderline1);
        model.addOrderLineToTransaction(1,orderLine2);
        model.addOrderLineToTransaction(2,orderline3);
        int result = model.averageTransactionCost();
        assertEquals(result,30);


    }

}
