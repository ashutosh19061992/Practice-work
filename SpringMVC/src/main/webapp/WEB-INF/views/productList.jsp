<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<div class="container mt-3">
	<div class="row">
		<div class="alert alert-primary">
			<h3>Product List</h3>
		</div>
	</div>
</div>

<div class="container">
	<c:if test="${msg}">
		<div class="alert alert-success" role="alert">"${msg}"</div>
	</c:if>
</div>

<div class="container mt-1">
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">ProductId</th>
				<th scope="col">Product Name</th>
				<th scope="col">Product Desciption</th>
				<th scope="col">Product Price</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="{products}" var="product">
				<tr>
					<td>"${product.id}"</td>
					<td>"${product.name}"</td>
					<td>"${product.description}"</td>
					<td>"${product.price}"</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<jsp:include page="footer.jsp" />