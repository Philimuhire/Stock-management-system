<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Items</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }
        h1 {
            text-align: center;
            margin-top: 50px;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            border: 1px solid #ddd;
            background-color: #fff;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #007bff;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Items</h1>
    <table>
        <thead>
            <tr>
                <th>Item ID</th>
                <th>Item Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>${item.itemID}</td>
                    <td>${item.itemName}</td>
                    <td>${item.description}</td>
                    <td>${item.price}</td>
                    <td>${item.quantity}</td>
                    <td>
                        <!-- Add buttons for editing and deleting items -->
                        <a href="edit-item.jsp?id=${item.itemID}" class="button">Edit</a>
                        <a href="delete-item?id=${item.itemID}" class="button">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <!-- Add a button to navigate to the add-item page -->
    <a href="add-item.jsp" class="button">Add Item</a>
</body>
</html>

