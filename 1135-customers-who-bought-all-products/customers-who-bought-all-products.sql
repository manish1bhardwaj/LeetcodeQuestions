select c.customer_id from Customer c
group by c.customer_id
HAVING COUNT(DISTINCT c.product_key)=(SELECT COUNT(*) FROM Product)


