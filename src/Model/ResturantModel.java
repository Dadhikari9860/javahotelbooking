package Model;

public class ResturantModel {
	private int Fid;
	private String FoodItem;
	private int PerPrice;
	private int Quantity;
	private String TotalPrice;
	private String CreditCard;
	public ResturantModel() {
		
		Fid = 0;
		FoodItem = "";
		PerPrice = 0;
		Quantity = 0;
		TotalPrice = "";
		CreditCard = "";
	}
	public ResturantModel(int fid, String foodItem, int perPrice, int quantity, String totalPrice,
			String creditCard) {
		super();
		Fid = fid;
		FoodItem = foodItem;
		PerPrice = perPrice;
		Quantity = quantity;
		TotalPrice = totalPrice;
		CreditCard = creditCard;
	}
	public int getFid() {
		return Fid;
	}
	public void setFid(int fid) {
		Fid = fid;
	}
	public String getFoodItem() {
		return FoodItem;
	}
	public void setFoodItem(String foodItem) {
		FoodItem = foodItem;
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
		return "ResturantModel [Fid=" + Fid + ", FoodItem=" + FoodItem + ", PerPrice=" + PerPrice + ", Quantity="
				+ Quantity + ", TotalPrice=" + TotalPrice + ", CreditCard=" + CreditCard + "]";
	}

}
