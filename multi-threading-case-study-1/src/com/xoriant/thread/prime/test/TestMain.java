package com.xoriant.thread.prime.test;

public class TestMain {
	public static void main(String[] args) {
		Series series = (i)-> System.out.println();
		series.display(45);
		
		
		
		Series series2 = new Series() {
			
			@Override
			public void display(int i) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
// product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
//			product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));