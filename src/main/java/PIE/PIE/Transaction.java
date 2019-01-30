package PIE.PIE;

import java.util.*;

public class Transaction {
	
	int transactionId;
    int branch;
    int custId;
    String status;
    int total;
    List<OrderLine> orderLineList;
    
	public Transaction(int transactionId, int branch, int custId, String status) {
		this.transactionId = transactionId;
		this.branch = branch;
		this.custId = custId;
		this.status = status;
		orderLineList = new ArrayList<OrderLine>();
	}

	@Override
	public String toString() {
		return this.transactionId + " " + this.branch + " " + this.custId + " " + this.status + " ";
	}
}
