package PIE.PIE;

public interface PointOfSalesIntegratedEnv {
	public void createBranch(Branch branch);
	public Branch getbBranch(int branchId);
	public List<Branch> getAllBranch();
	public void createCustomer(Customer customer);
	public Customer getCustomer(int customerId);
	public void createProduct(Product product);
	public Product getProduct(int productId);
	public void createTransaction(Transaction transaction);
	public void addOrderLineToTransaction(int transactionId, OrderLine orderLine);
	public void completeOrder(int transactionId);
	public string trackTransaction(int transactionId);
}





