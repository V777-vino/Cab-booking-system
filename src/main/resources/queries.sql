CREATE DATABASE cab_booking_app;

CREATE TABLE  ADMIN(
admin_id INT PRIMARY KEY AUTO_INCREMENT,
admin_name VARCHAR(30) NOT NULL,
admin_email VARCHAR (50) NOT NULL,
admin_password VARCHAR(30) NOT NULL
);

SELECT*FROM ADMIN;
DROP TABLE ADMIN;

SELECT *FROM ADMIN WHERE admin_id =1 AND admin_password ="pass123";

INSERT INTO ADMIN(admin_name,admin_email,admin_password)
VALUES("raj","r@gmail.com","pass123");

CREATE TABLE manager(
manager_id INT PRIMARY KEY AUTO_INCREMENT,
manager_name VARCHAR(30) NOT NULL,
manager_email VARCHAR(40) NOT NULL,
manager_password VARCHAR(20) NOT NULL);

UPDATE manager SET manager_password ="pass7777" WHERE manager_id =2;

SELECT*FROM manager;

DROP TABLE manager;

SELECT * FROM manager WHERE manager_id =1;

INSERT INTO manager(manager_name,manager_email,manager_password)
VALUES("raj","r@gmail.com","pass123");
DELETE FROM manager WHERE manager_id = 2;

CREATE TABLE cab(
cab_number INT PRIMARY KEY AUTO_INCREMENT,
cab_name VARCHAR(50) NOT NULL,
seaters INT NOT NULL);

DROP TABLE cab;

SELECT*FROM cab;

CREATE TABLE employee(
employee_id INT PRIMARY KEY AUTO_INCREMENT,
employee_name VARCHAR(20) NOT NULL,
employee_email VARCHAR(20) NOT NULL,
employee_password VARCHAR(20) NOT NULL,
manager_identity INT NOT NULL);

DROP TABLE employee;

SELECT*FROM employee;
INSERT INTO employee(employee_name,employee_email,employee_password,manager_identity)
VALUES("vasanth","v@gmailcom","pass7777",1);

CREATE TABLE booking(
	booking_id INT AUTO_INCREMENT PRIMARY KEY,
	employee_id INT NOT NULL,
	src VARCHAR(50) NOT NULL,
	destn VARCHAR(50) NOT NULL,
	DATE DATE NOT NULL DEFAULT CURRENT_TIME,
	TIME TIME NOT NULL DEFAULT CURRENT_TIME,
	manager_id INT NOT NULL,
	approve BOOLEAN,
	cab_number INT
	
);
SELECT *FROM booking;
INSERT INTO booking(employee_id,src,destn,manager_id,approve,cab_number)
VALUES(1,"thambaram","t.nagar",1,TRUE,1);

SELECT*FROM booking WHERE booking_id =1;
DROP TABLE booking;

SELECT*FROM ADMIN;

INSERT INTO ADMIN(admin_name,admin_email,admin_password) VALUES("raj","r@gmail.com","pass123"),
("pravin","p@gmail.com","pass1234"),("john","j@gmail.com","pass777");

SELECT *FROM cab;
SELECT *FROM cab WHERE cab_number = 4;
DROP TABLE cab;

UPDATE booking SET approve = FALSE WHERE booking_id = 1;

DESC cab;

INSERT INTO cab(cab_name,seaters) VALUES ("maha cab",4);
SELECT*FROM cab;
DELETE FROM cab WHERE cab_number = 2;
SELECT*FROM ADMIN;