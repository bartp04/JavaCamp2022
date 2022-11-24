package staticDemo;

public class Main {
	
	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 200;
		product.name ="Logitech G300S";
		product.id = "23";
		
		manager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.CreateConnection();
	}

}
