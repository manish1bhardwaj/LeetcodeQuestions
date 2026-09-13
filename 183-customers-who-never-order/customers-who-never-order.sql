# Write your MySQL query statement below
Select c.name as Customers
from Customers as c
left Join Orders as o
on c.id = o.customerId
where o.id is null;