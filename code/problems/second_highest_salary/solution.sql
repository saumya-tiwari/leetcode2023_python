/* Write your T-SQL query statement below */
select max(salary) as SecondHighestSalary from employee where salary not in (select max(salary) from employee ) 
