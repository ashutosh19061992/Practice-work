package com.xoriant.eshop.model;

public class Review {

	private String id;
	private String userComment;
	private String ratting;
	private User user;
	private Product product;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String id, String userComment, String ratting, User user) {
		super();
		this.id = id;
		this.userComment = userComment;
		this.ratting = ratting;
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserComment() {
		return userComment;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	public String getRatting() {
		return ratting;
	}

	public void setRatting(String ratting) {
		this.ratting = ratting;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", userComment=" + userComment + ", ratting=" + ratting + ", user=" + user
				+ ", product=" + product + "]";
	}

}
