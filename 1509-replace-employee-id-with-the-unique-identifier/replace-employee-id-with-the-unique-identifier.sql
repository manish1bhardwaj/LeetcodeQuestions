select name , unique_id from Employees e
left join EmployeeUNI u
On e.id = u.id;
