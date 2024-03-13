<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Item</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
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
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box;
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
        <h1>Edit Item</h1>
        <form action="update-item" method="post">
            <input type="hidden" name="itemId" value="${item.itemId}">
            <label for="itemName">Item Name:</label>
            <input type="text" id="itemName" name="itemName" value="${item.itemName}">
            <label for="description">Description:</label>
            <input type="text" id="description" name="description" value="${item.description}">
            <label for="price">Price:</label>
            <input type="number" id="price" name="price" value="${item.price}">
            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" value="${item.quantity}">
            <input type="submit" value="Update Item">
        </form>
    </div>
</body>
</html>

