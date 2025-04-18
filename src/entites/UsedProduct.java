package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	private Date manufactureDate;
	
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(){
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")");
		return sb.toString();
	}
}
