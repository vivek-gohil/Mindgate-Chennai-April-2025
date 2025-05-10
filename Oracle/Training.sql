-- 17-APR-2025
-- DDL - CREATE , ALTER , DROP
-- DML - INSERT , UPDATE , DELETE , TRUNCATE
-- CONSTRAINTS 
    -- 1. PRIMARY KEY
    -- 2. FOREIGN KEY
    -- 3. UNIQUE KEY
    -- 4. NOT NULL
    -- 5. CHECK 
    -- 6. DEFAULT
    
-- AUTO INCREMENT , SEQUENCES 


-- DDL - CREATE , ALTER , DROP
-- CREATE TABLE
--DDL- CREATE,ALTER,DROP


DROP TABLE employee_details;
CREATE TABLE employee_details(
    employee_id number(5),
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    department_name VARCHAR(20),
    salary NUMBER(8,2),
    date_of_joining DATE,
    address VARCHAR(255),
    city VARCHAR(20),
    state VARCHAR(20),
    email VARCHAR(50),
    gender VARCHAR(7),
    birthdate DATE
);

INSERT INTO employee_details VALUES(1000,'Test','User','Testing',50000,'01-JAN-2025','Teynampet','Chennai','Tamil Nadu','test@test.com','Male','01-JAN-1992');
INSERT INTO employee_details VALUES(5100, 'Mohammed', 'Aashiq', 'Development', 25000, '07-APR-2025', 'Thoraipakkam', 'Chennai', 'Tamil Nadu', 'mohammed.ashiq@mindgate.in', 'Male', '15-JAN-2003');
INSERT INTO EMPLOYEE_DETAILS VALUES (5101,'Mohamed','Faheem','Development',25000,'07-APR-2025','Urapakkam','Chennai','Tamil Nadu','md@mgs.com','Male','30-JAN-2003');
INSERT INTO EMPLOYEE_DETAILS VALUES(5096,'Deepak','Rajan','FullStack',100000,'07-APR-2025','Ambattur','Chennai','Tamil Nadu','rvdeepak@gmail.com','Male','14-AUG-2003');
INSERT INTO employee_details VALUES(5102,'Naren','Sv','Development',25000,'07-APR-2025','Madipakkam','Chennai','Tamil Nadu','naren.s@mindgate.in','Male','06-NOV-2002');
INSERT INTO employee_details VALUES (5106,'Rakesh','Y','Development',25000,'07-APR-2025','Poonamallee','Chennai','Tamil Nadu','ejrakesh1@gmail.com','Male','08-Nov-2002');
INSERT INTO employee_details VALUES(5109,'SARAVANA','KANTH','Developement',25000,'07-APR-2025','TONDIARPET','Chennai','Tamil Nadu','saravanakanth.j@mindgate.com','Male','16-NOV-2002');
INSERT INTO employee_details VALUES(5092,'Ashwanthan','Jaisankar','Development',25000.00,'07-APR-2025','Thousand Lights','Chennai','Tamil Nadu','ashwanthtaxer@gmail.com','Male','02-May-2003');
INSERT INTO employee_details VALUES(5103,'Padmavathi','Padma','Development',50000,'07-APR-2025','Saidapet','Chennai','Tamil Nadu','padmavathi.b@mindgate.com','Female','22-SEP-2003');
INSERT INTO employee_details VALUES(5110,'Selvapriya','S','Development',25000.00,'07-APR-2025','Saidhapet','Chennai','Tamil Nadu','selvapriya.s@mindgate.com','Female','27-AUG-2002');
INSERT INTO employee_details VALUES (5095,'Dharmaraj','R','Development',500000.00,'07-APR-2025','Samayapuram','Trichy','Tamil Nadu','dharmaraj.r@mindgate.com','Male','14-FEB-2002');
INSERT INTO employee_details VALUES(5093,'Bharani','R','Development',500000,'07-APR-2025','Guindy','Chennai','Tamil Nadu','bharani@mindgate.com','Male','02-AUG-2002');
INSERT INTO employee_details VALUES( 5104, 'Pavan', 'Kadali', 'Db', 40000.00,'01-JAN-2025','JayaPrakash Nagar','Eluru','Andhra Pradesh','pavankumar.kadali@mindgate.in','Male', '25-AUG-2001');
INSERT INTO employee_details VALUES (5105,'Raj','Kumar','Cyber_Security',25000,'07-APR-2025','Gudur','Nellore','Andhra Pradesh','rajkumar.j@mindgate.com','Male','19-JULY-2001');
INSERT INTO employee_details VALUES (5112 , 'Agaldivity' , 'Sumith ' ,'Software Developer' , 200000.00 , '07-APR-2025' , 'Ramareddy' , 'Ramareddy' , 'Telangana' , 'sumith@gmail.com' , 'Male' , '10-may-2002');
INSERT INTO employee_details values(5111,'Subasri','SM','Developer',25000,'07-APR-2025','Vadapalani','Chennai','Tamil Nadu','subasree.mindgate.in','Female','21-APR-2004');
INSERT INTO employee_details  VALUES (5108,'Saranya','K','Development',25000.00,'07-APR-2025','Mangadu','Chennai','Tamil Nadu','saranya.k@gmail.com','Female','03-NOV-2003');
INSERT INTO employee_details VALUES(5097,'Divya','Darshini','Development',600000.00,'07-APR-2025','Ghatkesar','Hyderabad','Telangana','divyadarshini0601@gmail.com','Female','06-OCT-2001');
INSERT INTO employee_details VALUES (5094, 'Charan kumar' ,'Gorle', 'Developer',25000.00, '07-APR-2025', 'Machavaram', 'Vijayawda', 'Andhra Pradesh', 'charan94@gmail.com', 'Male', '16-SEP-2000');
INSERT INTO employee_details  VALUES (5098,'Haritha Sree.','S','Development',29000.00,'07-APR-2025','Madipakkam','Chennai','Tamil Nadu','harithasree.s@gmail.com','Female','29-NOV-2001');
INSERT INTO employee_details VALUES(5107,'Rahul','Kunamalla','QA',45000,'07-APR-2025','Karimnagar','Hyderabad','Telangana','RahulKunamalla50@gmail.com','Male','05-JUN-2002');
INSERT INTO employee_details VALUES(5099,'Manoj','Uthayakumar','Development',70000,'07-APR-2025','Pattukottai','Thanjavur','Tamil Nadu','manojsince2k1@gmail.com','Male','08-APR-2001');



-- ALTER TABLE
-- ADD NEW COLUMN
ALTER TABLE employee_details 
ADD pin_code NUMBER(7);

DESC employee_details;

-- REMOVE COLUMN 
ALTER TABLE employee_details 
DROP COLUMN pin_code;

-- RENAME
ALTER TABLE employee_details
RENAME COLUMN BITHDAY TO birthdate;

DESC employee_details;

-- RENAME
ALTER TABLE employee_details
RENAME COLUMN employee_details TO employee_id;

--ALTER TABLE ALTER COLUMN 
ALTER TABLE employee_details
MODIFY employee_id VARCHAR2(10);

ALTER TABLE employee_details
ADD pin_code NUMBER(7);

DESC employee_details;
 
ALTER TABLE employee_details
MODIFY pin_code VARCHAR2(7);

-- RENAME
ALTER TABLE employee_details
RENAME TO employees;

SELECT * FROM employee_details;
SELECT * FROM employees;

-- PRIMARY KEY CONSTRAINTyuhkjb
DROP TABLE product_details;
CREATE TABLE product_details (
    product_id NUMBER(5) PRIMARY KEY,
    name VARCHAR2(50),
    price NUMBER(8,2)
    -- CONSTRAINT product_id_pk PRIMARY KEY(product_id)
);
INSERT INTO product_details VALUES(101,'Nirma',500);
INSERT INTO product_details VALUES(NULL,'Lux',50);

SELECT * FROM user_constraints;
SELECT * FROM employees;

ALTER TABLE employees 
DROP COLUMN pin_code;

ALTER TABLE employees 
ADD CONSTRAINT employee_id_pk PRIMARY KEY(employee_id);
-- add duplicate row

ALTER TABLE employees
DROP CONSTRAINT employee_id_pk;

DELETE employees WHERE employee_id= 5099;

-- COMPOSIT PRIMARY KEY

DROP TABLE employees;
CREATE TABLE employee_details(
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    department_name VARCHAR(20),
    salary NUMBER(8,2),
    gender VARCHAR(7),
    birthdate DATE,
    CONSTRAINT employee_pk PRIMARY KEY(first_name,birthdate)
);
SELECT * FROM user_constraints;
INSERT INTO employee_details VALUES ('Seema','Jha','IT',50000,'Female','01-JAN-2000');
INSERT INTO employee_details VALUES ('Seema','Jha','IT',50000,'Female','01-JAN-2001');

SELECT * FROM employee_details;
-- Foreign Key
DROP TABLE employee_details;
CREATE TABLE department_details (
    department_id NUMBER(5),
    department_name VARCHAR2(50),
    CONSTRAINT department_id PRIMARY KEY(department_id)
);
INSERT INTO department_details VALUES(1,'IT');
INSERT INTO department_details VALUES(2,'QA');
SELECT * FROM department_details;
CREATE TABLE employee_details(
    employee_id NUMBER(5),
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    department_id NUMBER(5),
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id),
    CONSTRAINT department_id_fk FOREIGN KEY(department_id) 
                                    REFERENCES department_details(department_id) 
);

INSERT INTO employee_details VALUES(101,'Seema','Jha',1);
INSERT INTO employee_details VALUES(102,'Reema','Sha',1);
INSERT INTO employee_details VALUES(103,'Meena','Rai',2);
INSERT INTO employee_details VALUES(104,'Teena','Rao',2);
INSERT INTO employee_details VALUES(105,'Mona','Rao',5);

SELECT * FROM employee_details;

-- CHECK and Unique and Default and Not Null
DROP TABLE employee_details;
CREATE TABLE employee_details(
    employee_id VARCHAR2(10),
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    email VARCHAR2(50),
    city VARCHAR2(50) DEFAULT 'Chennai',
    CONSTRAINT employee_id_pk PRIMARY KEY(employee_id),
    CONSTRAINT employee_id_ck CHECK (employee_id LIKE 'MGS%'),
    CONSTRAINT employee_email_uq UNIQUE(email)
);
INSERT INTO employee_details(employee_id,email,city) 
VALUES('MGS101','test@test.com','Mumbai');
INSERT INTO employee_details(employee_id,first_name,last_name,email) 
VALUES('MGS101','Test','T','test@test.com');

INSERT INTO employee_details(employee_id,first_name,email) 
VALUES('MGS102','Test','test2@test.com');

ALTER TABLE employee_details
MODIFY last_name VARCHAR2(50) NULL;

DESC employee_details;
SELECT * FROM employee_details;


SELECT * FROM employee_details;
INSERT INTO employee_details(employee_id,first_name) 
VALUES('MGS102','Test');
INSERT INTO employee_details(employee_id,first_name) 
VALUES('MGS103','Test3');


DROP TABLE employee_details;


SELECT * FROM employee_details;

-- UPDATE
UPDATE employee_details SET salary = 50000 WHERE salary <= 25000;

-- DELETE
DELETE employee_details WHERE salary = 100000;

SELECT * FROM employee_details;

-- 1. Print the employees who earn more than 25000
SELECT * FROM employee_details WHERE salary > 25000;

-- 2. Print only female employees who earn more than 25000
SELECT * FROM employee_details WHERE salary > 25000 AND gender = 'Female';

-- 3. Print only female employees who earn more than 25000 and lives in Chennai
SELECT * FROM employee_details WHERE salary > 25000 AND gender = 'Female' AND city = 'Chennai';

-- 4. Print emplyees who lives in Telangana , Andhra Pradesh 
SELECT * FROM employee_details WHERE state = 'Andhra Pradesh' OR state = 'Telangana';
SELECT * FROM employee_details WHERE state IN( 'Andhra Pradesh','Telangana');

-- 5. Print employee who lives other than city as Chennai
SELECT * FROM employee_details WHERE city != 'Chennai';
SELECT * FROM employee_details WHERE city NOT IN 'Chennai';

-- 6. Print count of Male employees 
SELECT COUNT(gender) FROM employee_details WHERE gender = 'Male';

-- 7. Print count employees lives in each state 
SELECT state,count(state) FROM employee_details GROUP BY state;

-- 8. Print employees in sorted order - asc order by name
SELECT * FROM employee_details ORDER BY first_name;
SELECT * FROM employee_details ORDER BY state,city;

-- 9. Print count employees lives in each city in sorted order - by city asc
SELECT city, count(city) FROM employee_details GROUP BY city ORDER BY city;

-- 10. Print count employees lives in each city in sorted order - by count of city
SELECT city, count(city) FROM employee_details GROUP BY city ORDER BY count(city);

-- 11. Print count employees using group by salary
SELECT salary , count(salary) FROM employee_details GROUP BY salary ORDER BY salary;

-- 12. Print sum of salary of employees lives in each state
SELECT state , sum(salary) FROM employee_details GROUP BY state ORDER BY state;

-- 13. Print sum of salary and count of employees lives in each state
SELECT state , sum(salary) , count(salary) FROM employee_details GROUP BY state ORDER BY state;

--14. Print sum of salary and count of male employees lives in each state who earn more than 25000
SELECT state,sum(salary), count(salary) 
FROM employee_details 
WHERE gender = 'Male' AND salary > 25000 
GROUP BY state 
ORDER BY state;

-- 15 Print only if sum of salary is > 50000 of male employee lives in each state who earn more than 25000
SELECT state,sum(salary), count(salary) 
FROM employee_details 
WHERE gender = 'Male' AND salary > 25000 
GROUP BY state 
HAVING sum(salary) > 50000
ORDER BY state;

-- Auto Increment and Sequences
-- Truncate
-- Joins
    -- cross
    -- inner
    -- outer (left , right , full)
    -- self
-- Index - basics
-- Views
-- Procedures
-- Triggers



SELECT * FROM employee_details;
TRUNCATE TABLE employee_details;

-- Auto Increment and Sequences
CREATE SEQUENCE employee_id_seq
START WITH 1 INCREMENT BY 1;

INSERT INTO employee_details VALUES(employee_id_seq.nextVal, 'Mohammed', 'Aashiq', 'Development', 25000, '07-APR-2025', 'Thoraipakkam', 'Chennai', 'Tamil Nadu', 'mohammed.ashiq@mindgate.in', 'Male', '15-JAN-2003');
INSERT INTO employee_details VALUES (employee_id_seq.nextVal,'Mohamed','Faheem','Development',25000,'07-APR-2025','Urapakkam','Chennai','Tamil Nadu','md@mgs.com','Male','30-JAN-2003');
INSERT INTO employee_details VALUES(employee_id_seq.nextVal,'Deepak','Rajan','FullStack',100000,'07-APR-2025','Ambattur','Chennai','Tamil Nadu','rvdeepak@gmail.com','Male','14-AUG-2003');
INSERT INTO employee_details VALUES(employee_id_seq.nextVal,'Naren','Sv','Development',25000,'07-APR-2025','Madipakkam','Chennai','Tamil Nadu','naren.s@mindgate.in','Male','06-NOV-2002');
INSERT INTO employee_details VALUES (employee_id_seq.nextVal,'Rakesh','Y','Development',25000,'07-APR-2025','Poonamallee','Chennai','Tamil Nadu','ejrakesh1@gmail.com','Male','08-Nov-2002');

SELECT * FROM employee_details;

SELECT employee_id_seq.currVal FROM dual;
SELECT employee_id_seq.nextVal FROM dual;

DROP SEQUENCE employee_id_seq;

-- CREATE TABLE WITH IDENTITY COLUMN
DROP TABLE product_details;
CREATE TABLE product_details (
    -- product_id NUMBER(10) GENERATED BY DEFAULT AS IDENTITY(START WITH 1 INCREMENT BY 1),
    product_id NUMBER(10) GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1),
    product_name VARCHAR2(50),
    price NUMBER(10,2)
);
INSERT INTO product_details (product_name,price)
VALUES ('Nirma',10);
INSERT INTO product_details (product_name,price)
VALUES ('Lux',15);
INSERT INTO product_details (product_id,product_name,price)
VALUES (30,'Logi',3000);


SELECT * FROM product_details;

DROP TABLE product_details;
CREATE TABLE product_details (
    product_id VARCHAR2(10) ,
    product_name VARCHAR2(50),
    price NUMBER(10,2)
);

CREATE SEQUENCE product_id_seq
START WITH 1000 INCREMENT BY 1;

INSERT INTO product_details
VALUES ('PROD'||product_id_seq.nextVal ,'Nirma',10);
INSERT INTO product_details
VALUES ('PROD'||product_id_seq.nextVal ,'Lux',15);
INSERT INTO product_details 
VALUES ('PROD'||product_id_seq.nextVal ,'Logi',3000);

SELECT * FROM product_details;
 

-- Joins
CREATE TABLE candidates (
    candidate_id NUMBER(5),
    name VARCHAR2(50)
);

INSERT INTO candidates VALUES(1,'Reema');
INSERT INTO candidates VALUES(2,'Seema');
INSERT INTO candidates VALUES(3,'Meena');
INSERT INTO candidates VALUES(4,'Teena');
INSERT INTO candidates VALUES(5,'Leena');

drop table employees;
CREATE TABLE employees (
    employee_id NUMBER(5),
    name VARCHAR2(50)
);

INSERT INTO employees VALUES(101,'Reema');
INSERT INTO employees VALUES(102,'Seema');
INSERT INTO employees VALUES(103,'Teena');
INSERT INTO employees VALUES(104,'Leena');
INSERT INTO employees VALUES(105,'Bheema');

SELECT * FROM employees;


-- 1. Cros Join
SELECT * FROM candidates , employees;
SELECT * FROM candidates CROSS JOIN employees;

-- 2. Inner Join
SELECT * FROM candidates c INNER JOIN employees e 
ON
c.name = e.name;

SELECT * FROM candidates NATURAL JOIN employees;

-- 3. left outer join
SELECT * FROM candidates c LEFT OUTER JOIN employees e 
ON
c.name = e.name;

-- 4. Right outer join
SELECT * FROM candidates c RIGHT OUTER JOIN employees e 
ON
c.name = e.name;

-- 5 . Full outer join
SELECT * FROM candidates c FULL OUTER JOIN employees e 
ON
c.name = e.name;

SELECT * FROM candidates c FULL OUTER JOIN employees e 
ON
c.name = e.name;

-- Self Join
DROP TABLE employees;
CREATE TABLE employees(
    employee_id NUMBER(5),
    name VARCHAR2(50),
    salary NUMBER(8,2),
    manager_id NUMBER(5)
);
INSERT INTO employees VALUES(101,'Reema',80000,NULL);
INSERT INTO employees VALUES(102,'Seema',60000,101);
INSERT INTO employees VALUES(103,'Meena',60000,101);
INSERT INTO employees VALUES(104,'Teena',50000,102);
INSERT INTO employees VALUES(105,'Sheela',50000,104);

SELECT * FROM employees;

SELECT * FROM employees e CROSS JOIN employees m;

SELECT * FROM employees e INNER JOIN employees m
ON e.manager_id = m.employee_id;

SELECT e.name as Employee, 'Reports_To' , m.name as Manager FROM employees e INNER JOIN employees m
ON e.manager_id = m.employee_id;


-- index
SELECT * FROM employee_details;

CREATE UNIQUE INDEX employee_id_ix ON employee_details(employee_id);

SELECT * FROM employee_details WHERE employee_id = 5098;

SELECT * FROM user_indexes;

DROP INDEX employee_id_ix;




SELECT * FROM employee_details;

CREATE VIEW employee 
AS 
    SELECT employee_id,first_name,last_name,city ,state
    FROM employee_details;

SELECT * FROM employee;

SELECT * FROM employee WHERE city = 'Chennai' ORDER BY first_name asc;

DELETE employee WHERE employee_id = 1000;


UPDATE employee SET salary = 50000 WHERE first_name='Rahul';

DROP VIEW employee;

-- Read Only
CREATE VIEW employee 
AS 
    SELECT employee_id,first_name,last_name,city ,state
    FROM employee_details WITH READ ONLY;

DELETE employee WHERE employee_id = 1000;


-- Stored Procedure

SELECT * FROM employee_details;
CREATE OR REPLACE PROCEDURE get_salary_name(e_id IN NUMBER,p_salary OUT NUMBER,p_name OUT VARCHAR2)
AS
BEGIN
    SELECT salary,first_name INTO p_salary,p_name FROM employee_details 
    WHERE employee_id = e_id;
END;
/

SET SERVEROUTPUT ON;
declare
    n_employee_id NUMBER(5) := 5100;
    n_salary NUMBER(8,2);
    n_f_name VARCHAR2(50);
begin
    get_salary_name(n_employee_id,n_salary,n_f_name);
    DBMS_OUTPUT.PUT_LINE( 'Name : ' || n_f_name );
    DBMS_OUTPUT.PUT_LINE( 'Salary : ' || n_salary );
end;
/

SELECT * FROM employee_details WHERE employee_id = 5100;


ALTER SESSION SET "_ORACLE_SCRIPT"=true;
  
CREATE USER group_one IDENTIFIED BY group_one;
GRANT CONNECT,DBA TO group_one;

CREATE USER group_two IDENTIFIED BY group_two;
GRANT CONNECT,DBA TO group_two;

CREATE USER group_three IDENTIFIED BY group_three;
GRANT CONNECT,DBA TO group_three;

CREATE USER group_four IDENTIFIED BY group_four;
GRANT CONNECT,DBA TO group_four;

CREATE USER group_five IDENTIFIED BY group_five;
GRANT CONNECT,DBA TO group_five;



