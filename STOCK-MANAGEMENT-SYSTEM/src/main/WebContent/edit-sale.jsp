<%@ page import="com.mycompany.stockmanagement.entities.SALE" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Sale</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 10px;
        }
        input[type="text"], input[type="number"] {
            padding: 10px;
            margin-bottom: 20px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Edit Sale</h1>
        <form action="update-sale.jsp" method="post">
            <input type="hidden" name="id" value="<%= sale.getId() %>">
            <label for="product">Product:</label>
            <input type="text" id="product" name="product" value="<%= sale.getProduct() %>">
            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" value="<%= sale.getQuantity() %>">
            <label for="price">Price:</label>
            <input type="text" id="price" name="price" value="<%= sale.getPrice() %>">
            <input type="submit" value="Save Changes">
        </form>
    </div>
</body>
</html>

