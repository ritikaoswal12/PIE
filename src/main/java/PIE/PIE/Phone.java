package PIE.PIE;

public class Phone extends Product{
	
	public Phone(int pId, float price, String brand, boolean prepaid) {
		super(pId, price, brand);
		this.prepaid = prepaid;
	}

	boolean prepaid;
	
	

}
