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
    employee_details number(5),
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
    bithday DATE
);

INSERT INTO employee_details VALUES(1000,'Test','User','Testing',50000,'01-JAN-2025','Teynampet','Chennai','Tamil Nadu','test@test.com','Male','01-JAN-1992');

SELECT * FROM employee_details;
SELECT * FROM employees;

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
INSERT INTO employees VALUES(5099,'Manoj','Uthayakumar','Development',70000,'07-APR-2025','Pattukottai','Thanjavur','Tamil Nadu','manojsince2k1@gmail.com','Male','08-APR-2001');



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

-- PRIMARY KEY CONSTRAINT
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
    CONSTRAINT department_id_fk FOREIGN KEY(department_id) REFERENCES department_details(department_id) 
);

INSERT INTO employee_details VALUES(101,'Seema','Jha',1);
INSERT INTO employee_details VALUES(102,'Reema','Sha',1);
INSERT INTO employee_details VALUES(103,'Meena','Rai',2);
INSERT INTO employee_details VALUES(104,'Teena','Rao',2);

SELECT * FROM employee_details;










