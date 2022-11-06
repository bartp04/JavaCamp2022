package classesWithAttributes;

public class ProductManager  {

	public void AddName (Product product) {

		System.out.println("Product has added: " + product.getName());

	}
	
	public void AddId (Product product) {

		System.out.println("Product Id: " + product.getId());

	}
	
	public void AddStockAmount (Product product) {

		System.out.println("Left in stock: " + product.getStockAmount());

	}
	
	public void AddDescription (Product product) {
		System.out.println("Description: " + product.getDescription() );
	}
	
	public void AddColor (Product product) {
		System.out.println("Color: " + product.getColor());
	}
	
	public void AddPrice (Product product) {
		System.out.println("Price: " + product.getPrice() + " $");
	}
	
	
	
	
	

}
