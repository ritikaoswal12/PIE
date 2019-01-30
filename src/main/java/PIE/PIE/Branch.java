package PIE.PIE;

import java.util.Objects;

public class Branch {
	int branchId;
	String city;
	String country;	
	
	public Branch(int branchId, String city, String country){
		this.branchId = branchId;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return this.branchId + " " +this.city + " " + this.country;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Branch branch = (Branch) o;
		return branchId == branch.branchId &&
				Objects.equals(city, branch.city) &&
				Objects.equals(country, branch.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(branchId, city, country);
	}
}
