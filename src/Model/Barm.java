package Model;

public class Barm {
	private int BarId;
	private String Drinks;
	private int PerPrice;
	private int Quantity;
	private String TotalPrice;
	private String CreditCard;
	public Barm() {
		
		BarId = 0;
		Drinks = "";
		PerPrice = 0;
		Quantity = 0;
		TotalPrice = "";
		CreditCard = "";
	}
	public Barm(int barId, String drinks, int perPrice, int quantity, String totalPrice, String creditCard) {
		super();
		BarId = barId;
		Drinks = drinks;
		PerPrice = perPrice;
		Quantity = quantity;
		TotalPrice = totalPrice;
		CreditCard = creditCard;
	}
	public int getBarId() {
		return BarId;
	}
	public void setBarId(int barId) {
		BarId = barId;
	}
	public String getDrinks() {
		return Drinks;
	}
	public void setDrinks(String drinks) {
		Drinks = drinks;
	}
	public int getPerPrice() {
		return PerPrice;
	}
	public void setPerPrice(int perPrice) {
		PerPrice = perPrice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(String creditCard) {
		CreditCard = creditCard;
	}
	@Override
	public String toString() {
		return "Barm [BarId=" + BarId + ", Drinks=" + Drinks + ", PerPrice=" + PerPrice + ", Quantity=" + Quantity
				+ ", TotalPrice=" + TotalPrice + ", CreditCard=" + CreditCard + "]";
	}
	
}
