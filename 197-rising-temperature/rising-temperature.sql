# Write your MySQL query statement below
SELECT w1.id as ID
FROM Weather w1, Weather w2
WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1 
AND w2.temperature < w1.temperature