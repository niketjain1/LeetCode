# Write your MySQL query statement below
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT OUTER JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS Null
GROUP BY v.customer_id;