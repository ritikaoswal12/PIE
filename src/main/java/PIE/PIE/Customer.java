package PIE.PIE;

import java.util.Objects;

public class Customer {
	int id;
	String name;
	String address;
	String zip;
	int branch;
	
	public Customer(int id, String name, String address, String zip, int branch) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.zip = zip;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " +this.address+ " " +this.zip + " " +this.branch;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return id == customer.id &&
				branch == customer.branch &&
				Objects.equals(name, customer.name) &&
				Objects.equals(address, customer.address) &&
				Objects.equals(zip, customer.zip);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, zip, branch);
	}
}
