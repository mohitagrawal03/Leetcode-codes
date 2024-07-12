# Write your MySQL query statement below
# SELECT name FROM Customer WHERE COALESCE(referee_id,0) <> 2;
# SELECT name FROM Customer WHERE IFNULL(referee_id,0) <> 2;
# SELECT name FROM Customer WHERE referee_id != 2 OR referee_id is NULL;
SELECT name 
FROM Customer 
WHERE id NOT IN (SELECT id
                 FROM Customer
                 WHERE referee_id = 2);