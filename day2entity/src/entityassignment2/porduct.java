package entityassignment2;

public class porduct {
	private String quality,city;
	private String quantity;
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "porduct [quality=" + quality + ", city=" + city + ", quantity=" + quantity + "]";
	}
	
	

}
