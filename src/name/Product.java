package tnsif.lambdaexp;

public class Product {

	int prodId;
	String prodName;
	int price;
	
	public Product(int prodId, String prodName, int price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
	
	
}
