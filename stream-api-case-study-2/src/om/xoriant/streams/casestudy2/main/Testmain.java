package om.xoriant.streams.casestudy2.main;

import om.xoriant.streams.casestudy2.service.ProductService;

public class Testmain {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		System.out.println("All product price >>>> " + productService.getAllProductPrice() + "\n");
		System.out.println("Average product price >>>> " + productService.getAverageOfProductsPrice() + "\n");
		System.out.println("Product Price based on Rating >>>> " + productService.getProductsPriceRatingWise(4) + "\n");
		System.out.println("Limiting Product Count >>>> " + productService.limitProductCount(3) + "\n");
	}
}
