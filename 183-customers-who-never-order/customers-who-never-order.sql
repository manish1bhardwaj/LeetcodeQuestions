SELECT name AS Customers FROM Customers
LEFT join Orders AS Orders
ON Customers.id = Orders.CustomerId
WHERE Orders.customerId IS NULL ;


