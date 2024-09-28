# Write your MySQL query statement below
SELECT customer_id, COUNT(Visits.visit_id) AS count_no_trans
FROM Visits
LEFT JOIN Transactions ON Transactions.visit_id = Visits.Visit_id
WHERE Transactions.transaction_id IS NULL
GROUP BY customer_id

# SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans 
# from Visits v 
# LEFT JOIN Transactions t 
# ON v.visit_id = t.visit_id  
# WHERE t.transaction_id IS NULL 
# GROUP BY v.customer_id; 