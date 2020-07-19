BEGIN TRANSACTION;

CREATE TABLE departments (
        department_id serial,
        name varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_department_id PRIMARY KEY (department_id)   
 );

CREATE TABLE job_titles (
        title_id serial,
        title varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_job_title_id PRIMARY KEY (title_id)       
);
 
CREATE TABLE employees (
        employee_id int NOT NULL DEFAULT nextval('seq_project_id'),
        first_name varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        gender char(1),
        birthday date,
        hire_date date NOT NULL,
        department_id integer NOT NULL,
        job_title_id integer NOT NULL,
        CONSTRAINT pk_employee_id PRIMARY KEY (employee_id),
        CONSTRAINT fk_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_titles(title_id),
        CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE projects (
        project_id serial,
        name varchar(255) NOT NULL UNIQUE,
        start_date date NOT NULL,
        end_date date NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY (project_id),
        CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);

CREATE TABLE project_employee (
        project_id serial,
        employee_id int NOT NULL,
        CONSTRAINT pk_project_employee PRIMARY KEY (project_id, employee_id)
        CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES projects(project_id)
        CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);
        --insert data into departments
        INSERT INTO departments (name) VALUES ('Human Resources');
        INSERT INTO departments (name) VALUES ('Finance'); 
        INSERT INTO departments (name) VALUES ('Project Management');
        INSERT INTO departments (name) VALUES ('Reasearch and Development');

        --insert data into job titles
        INSERT INTO job_titles (title) VALUES ('Project Director');
        INSERT INTO job_titles (title) VALUES ('Project Manager');
        INSERT INTO job_titles (title) VALUES ('Associate');
        INSERT INTO job_titles (title) VALUES ('Developer');

        --insert data into employee information
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Bruce','Wayne','2018-01-01', 'M', '1996-09-28');
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Clark','Kent','2020-01-01', 'M', '1985-05-28');
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Dianna','Prince','2020-01-01', 'F', '1988-04-28');
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Wallie','West','2020-01-01', 'M', '1996-03-03'); 
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Tony','Stark','2018-01-01', 'M', '1978-11-12`'); 
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Steve','Rogers','2019-01-01', 'M', '1996-09-28'); 
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Natasha','Romanoff','2019-01-01', 'F', '1987-09-13'); 
        INSERT INTO employees (first_name,last_name, gender, hire_date, birthday, department_id, title_id) VALUES ('Bruce','Banner','2019-01-01', 'M', '1996-09-28');

        --insert all projects into projects
        INSERT INTO projects (name, start_date) VALUES ('BatCave','2018-10-31');
        INSERT INTO projects (name, start_date) VALUES ('BatCave','2018-10-31');
        INSERT INTO projects (name) VALUES ('Avengers Initiative');
        INSERT INTO projects (name, start_date, end_date) VALUES ('Avengers Initiative','2018-10-10');
        INSERT INTO projects (name, start_date, end_date) VALUES ('Save World','2019-08-05', '2020-03-11');
        INSERT INTO projects (name, start_date, end_date) VALUES ('Save World','2019-08-05', '2020-10-11');
        INSERT INTO projects (name, start_date, end_date) VALUES ('Schwarma','2020-10-11', '2020-12-20');
        INSERT INTO projects (name, start_date, end_date) VALUES ('Schwarma','2020-10-11', '2020-12-11');

        --SELECT * FROM job_titles;
        --SELECT * FROM departments;
        --SELECT * FROM employees;
        --SELECT * FROM projects;

        ROLLBACK;

        COMMIT;