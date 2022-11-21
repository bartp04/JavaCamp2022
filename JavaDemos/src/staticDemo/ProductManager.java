package staticDemo;

public class ProductManager {
	
	Product product;
	
//	public ProductManager(String name, String id, double price) {
//		this.product.name = name; 
//		this.product.id = id;
//		this.product.price = price;
//		
//	}
	
	static {
		System.out.println("Static constructor block is working.");
	}

	public void add(Product product) {

		if (ProductValidator.isValid(product)) {
			System.out.println("Product is added.");
		}

		else {
			System.out.println("Error, invalid product information.");
		}

	}

}
