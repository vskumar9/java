CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    department VARCHAR(255)
);

INSERT INTO students (name, department) VALUES
('Priya', 'CSE'),
('Sanjeev', 'IT'),
('Ram', 'ECE');


DELIMITER //
CREATE PROCEDURE insertStudent(IN sname VARCHAR(255), IN sdept VARCHAR(255), OUT newId INT)
BEGIN
    -- Insert a new record
    INSERT INTO students (name, department) VALUES (sname, sdept);

    -- Get the ID of the newly inserted record
    SET newId = LAST_INSERT_ID();
END //
DELIMITER ;