package om.xoriant.streams.casestudy2.utility;

import java.util.ArrayList;
import java.util.List;

import om.xoriant.streams.casestudy2.enitity.Product;

public final class ProductUtilty {
	private static List<Product> productList = new ArrayList<Product>();

	private ProductUtilty() {
		// private constructor
	}

	static {
		productList.add(new Product("PROD-Mob", "Samsung Mobile", 30000.0, 3));
		productList.add(new Product("PROD-TV", "Sony Bravia", 7900.0, 4));
		productList.add(new Product("PROD-COM", "Lenevo Desktop", 56000.0, 2));
		productList.add(new Product("PROD-LAP", "Dell Laptop", 45000.0, 4));
		productList.add(new Product("PROD-ELE", "Head Phone", 700.50, 4));
		productList.add(new Product("PROD-EQUI", "Office Chair", 5000.0, 2));
		productList.add(new Product("PROD-EQUI", "Office table", 4000.0, 5));
		productList.add(new Product("PROD_ELE", "Bulb", 200.0, 4));
		productList.add(new Product("PROD-CLOT", "XL Blue Shirt", 999.0, 3));
	}

	public static List<Product> getAllProducts() {
		return productList;
	}
}
