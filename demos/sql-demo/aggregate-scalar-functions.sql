DROP TABLE IF EXISTS functions_table;
CREATE TABLE IF NOT EXISTS functions_table (
	id serial PRIMARY KEY,
	string VARCHAR(500),
	created TIMESTAMP
);

SELECT * FROM functions_table;


--Scalar functions: These perform operations on a number of inputs, producing one output for each.
--Remember "scalar" like it scales something (transforms it)

--NOW() function returns the current time, so let's use that to store a create timestamp for new rows.
INSERT INTO functions_table (string, created) VALUES ('test string', NOW());

--using the LCASE() and UCASE() functions we can make the text upper or lower case 
--(note that this doesn't change the stored data, it adjusts it on the fly.)
SELECT UPPER(string) FROM functions_table;
SELECT LOWER(UPPER(string)) FROM functions_table;
SELECT UPPER(LOWER(UPPER(string))) FROM functions_table;

--using LENGTH() we can get the length of a string instead of the string itself
SELECT LENGTH(string) FROM functions_table;


--Aggregate functions: these perform operations on a number inputs, producing one single output
--Remember "aggregate" means to collect things into a single logical grouping

--SUM() sums up all of the inputted values
SELECT SUM(id) FROM functions_table

-- AVG() gives the average
SELECT AVG(id) FROM functions_table 

-- COUNT() sounts the number of rows in the result set
SELECT COUNT(*) FROM functions_table

-- MIN() and MAX() return the smallest and largest values from a result set
SELECT MIN(id) FROM functions_table
SELECT MAX(id) FROM functions_table
