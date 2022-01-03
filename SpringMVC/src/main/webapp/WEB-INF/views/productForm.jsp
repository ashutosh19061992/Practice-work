<jsp:include page="header.jsp"></jsp:include>
<div class="container mt-5" style="padding: 5px; border: medium;">
	<form action="saveProduct" method="post">
		<div class="form-group">
			<label for="name">Product Name</label> <input type="text" name="name"
				class="form-control" class="form-text text-muted">
		</div>
		<div class="form-group">
			<label for="name">Produt Price</label> <input type="text"
				name="price" class="form-control" class="form-text text-muted">
		</div>
		<div class="form-group">
			<label for="description">Product Description</label>
			<textarea name="description" class="form-control"
				class="form-text text-muted"></textarea>
		</div>
		<button type="submit" class="btn btn-primary mt-1">Submit</button>
	</form>
</div>
<jsp:include page="footer.jsp"></jsp:include>