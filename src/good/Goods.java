package good;

public class Goods {

	private int goodId;
	private String goodName;
	private int price;
	public Goods() {
	}
	
	public Goods(int goodId, String goodName, int price) {
		super();
		this.goodId = goodId;
		this.goodName = goodName;
		this.price = price;
	}

	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [goodId=" + goodId + ", goodName=" + goodName + ", price=" + price + "]";
	}
	
}
