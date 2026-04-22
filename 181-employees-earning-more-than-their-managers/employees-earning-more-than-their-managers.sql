SELECT a.name AS Employee FROM Employee AS a 
JOIN Employee AS b
ON a.managerId = b.Id
WHERE a.salary > b.salary;

