<%@ page import="java.util.List" %>
<%@ page import="com.mycompany.stockmanagement.entities.CUSTOMER" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customers</title>
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
        <h1>Customers</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Contact</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%@ page import="java.util.List" %>
                <%@ page import="com.mycompany.stockmanagement.entities.CUSTOMER" %>
                <% List<CUSTOMER> customers = (List<CUSTOMER>) request.getAttribute("customers"); %>
                <% for (CUSTOMER customer : customers) { %>
                    <tr>
                        <td><%= customer.getCustomerID() %></td>
                        <td><%= customer.getName() %></td>
                        <td><%= customer.getContact() %></td>
                        <td class="actions">
                            <a href="edit-customer.jsp?id=<%= customer.getCustomerID() %>">Edit</a>
                            <a href="delete-customer.jsp?id=<%= customer.getCustomerID() %>" onclick="return confirm('Are you sure you want to delete this customer?')">Delete</a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        <p><a href="add-customer.jsp">Add Customer</a></p>
    </div>
</body>
</html>

