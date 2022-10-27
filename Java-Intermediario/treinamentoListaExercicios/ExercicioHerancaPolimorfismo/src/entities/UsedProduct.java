package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	protected Date manuFactureDate; 
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}

	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}
	
	 @Override
	    public String toString() {
	        return name
	        + "(Used)"
	        + "$ "
	        + String.format("%.2f", getPrice())
	        + "(" + sdf.format(manuFactureDate)+ ")";
	    }
	
	
	
	
}
