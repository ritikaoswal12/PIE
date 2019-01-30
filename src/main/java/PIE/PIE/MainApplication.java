package PIE.PIE;


public class MainApplication {

    public static void main(String[] args){
        Branch branch1 = new Branch(1, "Mumbai", "india");
        Customer customer1 = new Customer(1,"Ritika","NJ","07302",1);
        Transaction transaction1 = new Transaction(1, 1,1,"O");
        Transaction transaction2 = new Transaction(2, 1,1,"O");
        OrderLine orderline1 = new OrderLine(1, 20);
        OrderLine orderLine2 = new OrderLine(2,30);
        OrderLine orderline3 = new OrderLine(3,10);


        InMemoryPointOfSalesIntegratedEnvironment model = new InMemoryPointOfSalesIntegratedEnvironment();

        model.createBranch(branch1);
        System.out.println(model.getbBranch(1));
        model.createCustomer(customer1);
        System.out.println(model.getCustomer(1));
        model.createTransaction(transaction1);
        System.out.println(model.trackTransaction(1));
        model.completeOrder(1);
        System.out.println(model.trackTransaction(1));
        model.addOrderLineToTransaction(1,orderline1);
        System.out.println(transaction1.total);
        model.addOrderLineToTransaction(1,orderLine2);
        System.out.println(transaction1.total);
        System.out.println(model.transactionHashMap);
        System.out.println(model.getAllBranch());
        System.out.println(model.averageTransactionCost());
        model.createTransaction(transaction2);
        model.addOrderLineToTransaction(2,orderline3);
        System.out.println(model.averageTransactionCost());

//



    }
}
