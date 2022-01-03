package com.xoriant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xoriant.model.Product;
import com.xoriant.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/newProduct")
	public String addProduct() {
		return "productForm";
	}

	@RequestMapping("/products")
	public String getAllProducts() {
		return "productList";
	}

	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product, Model model) {
		String msg = "";
		if (this.productService.addProduct(product)) {
			msg += "Product added successfully..";
		} else {
			msg += "Somthing went wrong.";
		}
		model.addAttribute("msg", msg);
		return "productList";
	}
}
