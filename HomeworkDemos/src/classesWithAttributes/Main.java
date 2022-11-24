package classesWithAttributes;

public class Main {
	
	public static void main(String[]arguments) {
		
		Product product = new Product("Laptop" , "Hp Omen Laptop", 29.999 ,1 , 2, "Red");
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Hp Omen Laptop");
		product.setPrice(29.999);
		product.setStockAmount(2);
		product.setColor("Red ");
		
		
		
		//System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		
		productManager.AddName(product);
		productManager.AddId(product);
		productManager.AddColor(product);
		productManager.AddDescription(product);
		productManager.AddPrice(product);
		productManager.AddStockAmount(product);
		System.out.println(product.getCode());
		
		
	}

}
