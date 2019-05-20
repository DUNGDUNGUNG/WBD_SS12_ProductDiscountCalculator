<%--
  Created by IntelliJ IDEA.
  User: lecongdung
  Date: 20/05/2019
  Time: 08:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<div class="product">
    <h2>Product Discount Calculator</h2>
    <form action="discount" method="post">
        <label>Product Description:
            <input type="text" name="description">
        </label><br>
        <label>List Price:
            <input type="text" name="price">
        </label><br>
        <label>Discount Percent:
            <input type="text" name="percent">
        </label><br>
        <label>
            <input type="submit" value="Calculate Discount">
        </label>
    </form>
</div>
</body>
</html>
