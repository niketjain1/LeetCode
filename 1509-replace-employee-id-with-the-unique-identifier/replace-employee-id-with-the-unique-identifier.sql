# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id, name
 FROM Employees
 LEFT OUTER JOIN EmployeeUNI
 ON Employees.id = EmployeeUNI.id;