<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
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
        .grid-container {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 20px;
        }
        .card {
            padding: 20px;
            background-color: #f9f9f9;
            border-radius: 5px;
            box-shadow: 0 0 5px rgba(0,0,0,0.1);
        }
        .card h2 {
            margin-top: 0;
        }
        .card p {
            margin-bottom: 10px;
        }
        .card a {
            color: #007bff;
            text-decoration: none;
        }
        .card a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Dashboard</h1>
        <div class="grid-container">
            <div class="card">
                <h2>Total Sales</h2>
                <p>${totalSales}</p>
                <a href="sales.jsp">View Details</a>
            </div>
            <div class="card">
                <h2>Total Purchases</h2>
                <p>${totalPurchases}</p>
                <a href="purchases.jsp">View Details</a>
            </div>
            <div class="card">
                <h2>Total Customers</h2>
                <p>${totalCustomers}</p>
                <a href="customers.jsp">View Details</a>
            </div>
        </div>
    </div>
</body>
</html>

