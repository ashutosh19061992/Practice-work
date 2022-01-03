package om.xoriant.streams.casestudy2.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import om.xoriant.streams.casestudy2.enitity.Product;
import om.xoriant.streams.casestudy2.utility.ProductUtilty;

public class ProductService {

	public Double getAllProductPrice() {
		return ProductUtilty.getAllProducts().stream().map(product -> product.getPrice()).mapToDouble(price -> price)
				.sum();
	}

	public Double getProductsPriceRatingWise(int rating) {
		return ProductUtilty.getAllProducts().stream().filter(product -> product.getRating() > rating)
				.map(product -> product.getPrice()).mapToDouble(price -> price).sum();
	}

	public Double getAverageOfProductsPrice() {
		return ProductUtilty.getAllProducts().stream().map(product -> product.getPrice()).mapToDouble(price -> price)
				.average().orElse(0.0);
	}

	public List<Product> limitProductCount(int setCount) {

		long productCount = ProductUtilty.getAllProducts().stream().count();
		Stream<Product> productStreams = ProductUtilty.getAllProducts().stream();

		if (productCount > 5) {
			return productStreams.limit(setCount).collect(Collectors.toList());
		} else {
			return productStreams.collect(Collectors.toList());
		}
	}
}
