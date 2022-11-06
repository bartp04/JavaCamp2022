package classesWithAttributes;

public class Product {
	
	public Product(String name,String description,double price,int id,int stockAmount,String color) { //Constructor
		this.name = name;
		this.description = description;
		this.price = price;
		this.id = id;
		this.stockAmount = stockAmount;
		this.color = color;
		System.out.println("Constructor block is working.");
	}
	
	public Product() {
		
	}
	
	

	 private String name;
	 private String description;
	 private double price;
	 private int stockAmount;
	 private int id;
	 private String color;
	 private String code;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return this.name.substring(0,1) + id ;
	}
	
	
	 
	 

	
	

}
