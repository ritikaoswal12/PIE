package PIE.PIE;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryPointOfSalesIntegratedEnvironment implements PointOfSalesIntegratedEnv {
	HashMap<Integer, Branch> branchHashMap;
	HashMap<Integer, Customer> customerHashMap;
	HashMap<Integer, Product> productHashMap;
	HashMap<Integer, Transaction> transactionHashMap;

	InMemoryPointOfSalesIntegratedEnvironment(){
		 branchHashMap = new HashMap<Integer, Branch>();
		 customerHashMap = new HashMap<Integer, Customer>();
		 productHashMap = new HashMap<Integer, Product>();
		 transactionHashMap = new HashMap<Integer, Transaction>();
	}

	//Branch Functions
	public void createBranch(Branch branch) {
		branchHashMap.put(branch.branchId,branch);
	}

	public Branch getbBranch(int branchId) {
		return branchHashMap.get(branchId);
	}

	public List<Branch> getAllBranch() {
		List<Branch>branchlist = new ArrayList<Branch>(branchHashMap.values());
		return branchlist;
	}

	//Customer Functions
	public void createCustomer(Customer customer) {
		customerHashMap.put(customer.id, customer);
	}

	public Customer getCustomer(int customerId) {
		return customerHashMap.get(customerId);
	}

	//Product Functions
	public void createProduct(Product product) {
		productHashMap.put(product.pId, product);
		
	}

	public Product getProduct(int productId) {
		return productHashMap.get(productId);
	}

	//Transaction functions
	public void createTransaction(Transaction transaction) {
		transactionHashMap.put(transaction.transactionId,transaction);

	}

	public void addOrderLineToTransaction(int transactionId, OrderLine orderLine) {
		transactionHashMap.get(transactionId).orderLineList.add(orderLine);
		transactionHashMap.get(transactionId).total += orderLine.cost;
	}

	public void completeOrder(int transactionId) {
		transactionHashMap.get(transactionId).status ="C";
	}

	public String trackTransaction(int transactionId) {
		return transactionHashMap.get(transactionId).status;
	}

	public int averageTransactionCost(){
	    int sum = 0;
	    int avg = 0;
	    for (Transaction t : transactionHashMap.values())
	         sum = sum + t.total;
	    avg = sum/transactionHashMap.size();
        return avg;
    }



}
