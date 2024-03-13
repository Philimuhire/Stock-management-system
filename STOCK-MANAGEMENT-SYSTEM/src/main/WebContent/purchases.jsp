<%@ page import="com.mycompany.stockmanagement.entities.PURCHASE" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Purchases</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
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
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .actions {
            text-align: center;
        }
        .actions a {
            margin-right: 10px;
            color: #007bff;
            text-decoration: none;
        }
        .actions a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Purchases</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Total</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <% for (PURCHASE purchase : purchases) { %>
                    <tr>
                        <td><%= purchase.getId() %></td>
                        <td><%= purchase.getProduct() %></td>
                        <td><%= purchase.getQuantity() %></td>
                        <td><%= purchase.getPrice() %></td>
                        <td><%= purchase.getTotal() %></td>
                        <td class="actions">
                            <a href="edit-purchase.jsp?id=<%= purchase.getId() %>">Edit</a>
                            <a href="delete-purchase.jsp?id=<%= purchase.getId() %>" onclick="return confirm('Are you sure you want to delete this purchase?')">Delete</a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        <p><a href="add-purchase.jsp">Add Purchase</a></p>
    </div>
</body>
</html>

