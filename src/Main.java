public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*CREATE TABLE region
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR(255),
    population VARCHAR(255),
    area       INT,
    year       INT
);
INSERT INTO region(name, population, area, year)
values ('Batken', 548200, 17048, 1999);
INSERT INTO region(name, population, area, year)
values ('Osh', 391700, 18200, 1939);
INSERT INTO region(name, population, area, year)
values ('Jalalabad', 32418, 17048, 1999);
INSERT INTO region(name, population, area, year)
values ('Talas', 271000, 13406, 1999);
INSERT INTO region(name, population, area, year)
values ('Naryn', 292100, 44160, 1999);
INSERT INTO region(name, population, area, year)
values ('Chuy', 975000, 19895, 1999);
INSERT INTO region(name, population, area, year)
values ('Isyk-Kol', 501000, 43735, 1999);

CREATE TABLE football_team
(
    id                INT,
    team_name         VARCHAR(255),
    team_year         INT,
    director          VARCHAR,
    number_of_workers VARCHAR
);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (1, 'REAL MADRID', 1878, 'F. Perez', 60);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (2, 'ATLETICO MADRID', 1978, 'NASSER', 66);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (3, 'MAN CITY', 1895, 'ABRAMOVICH', 61);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (4, 'MAN UNITED', 1456, 'MANSUR', 56);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (5, 'LIVERPOOL', 1870, 'HENRY', 45);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (6, 'TOTTENHAM', 1860, 'SALLIHAN', 50);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (7, 'SEVILLA', 1990, 'KRONKE', 39);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (8, 'JUVENTUS', 1900, 'HARRIS', 33);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (9, 'MILAN', 1925, 'BENAM', 41);
INSERT INTO football_team(id, team_name, team_year, director, number_of_workers)
VALUES (10, 'BVB', 1964, 'SAVIRIS', 70);

CREATE TABLE coaches
(
    id        SERIAL4 primary key,
    firs_name VARCHAR(255),
    last_name VARCHAR(255),
    age       INT,
    club      VARCHAR
);
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Pep','Guardiola',47,'MAN CITY');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Massimiliano','Allegri',50,'JUVENTUS');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Zinedine','Zidane',45,'REAL MADRID');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Antonio','Conte',48,'CHELSEA');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Diego','Simeone',47,'Atletico Madrid');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Jose','Mourinho',54,'MAN UNITED');
INSERT INTO coaches(firs_name, last_name, age, club) VALUES ('Unai','Emery',46,'PSG');

CREATE TABLE jobs(
    id SERIAL8 primary key ,
    job_name VARCHAR(255),
    working_our_a_day INT,
    min_salary INT,
    max_salary INT
);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('IT-Developer',5,35000,200000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Builder',12,35000,45000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Taxi driver',14,35000,40000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Chief',10,25000,30000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Security',8,8000,20000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Fireman',16,35000,50000);
INSERT INTO jobs(job_name, working_our_a_day, min_salary, max_salary) VALUES ('Doctor',8,45000,60000);

CREATE TABLE friends(
    id INT,
    name VARCHAR(255),
    surname VARCHAR(255),
    nickname VARCHAR(255),
    year INT
);
INSERT INTO friends(id, name, surname, nickname, year) VALUES (1,'Muhammad','Nurbekov','Bloger',2001);
INSERT INTO friends(id, name, surname, nickname, year) VALUES (2,'Nurtilek','Zhanyshaliev','Millioner',1994);
INSERT INTO friends(id, name, surname, nickname, year) VALUES (3,'Maksat','Kairullaev','Sheikh',1995);
INSERT INTO friends(id, name, surname, nickname, year) VALUES (4,'Nurdin','Kadyrov','Bolt',2002);
INSERT INTO friends(id, name, surname, nickname, year) VALUES (5,'Nursultan','Askarov','Megamozg',1998);

CREATE TABLE families(
    id INT,
    children INT,
    address VARCHAR(255),
    year_of_marriage INT,
    status VARCHAR
);
INSERT INTO families(id, children, address, year_of_marriage, status) VALUES (1,3,'Kadamzhai',1998,'happy');
INSERT INTO families(id, children, address, year_of_marriage, status) VALUES (2,5,'Osh',1994,'Rich');
INSERT INTO families(id, children, address, year_of_marriage, status) VALUES (3,8,'Bishkek',1998,'Middle');
INSERT INTO families(id, children, address, year_of_marriage, status) VALUES (4,10,'Batken',1965,'Fantastic');
INSERT INTO families(id, children, address, year_of_marriage, status) VALUES (5,2,'Talas',2018,'unhappy');

CREATE TABLE contacts(
    contact_id INT NOT NULL,
    contact_name VARCHAR(55),
    phone VARCHAR(16),
    country VARCHAR(55),
    year_of_performance INT
);
INSERT INTO contacts(contact_id, contact_name, phone, country, year_of_performance) VALUES (1,'Ulan','996773976832','Osh',2020);
INSERT INTO contacts(contact_id, contact_name, phone, country, year_of_performance) VALUES (1,'Datka','996704140201','Jalalabad',2021);
INSERT INTO contacts(contact_id, contact_name, phone, country, year_of_performance) VALUES (1,'Dastan','996705848499','Batken',2022);
INSERT INTO contacts(contact_id, contact_name, phone, country, year_of_performance) VALUES (1,'Aiperi','996707653214','Issyk-kol',2022);
INSERT INTO contacts(contact_id, contact_name, phone, country, year_of_performance) VALUES (1,'Bermet','99622023393','Naryn',2019);

CREATE TABLE products(
    product_id INT NOT NULL,
    product_name VARCHAR(64),
    product_weight INT,
    price INT NOT NULL,
    type VARCHAR(32)
);

INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (1,'apple',10,35,'fruit');
INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (2,'potato',20,50,'vegetable');
INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (3,'tomato',15,95,'vegetable');
INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (4,'banana',30,150,'fruit');
INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (5,'lemon',25,400,'fruit');
INSERT INTO products(product_id, product_name, product_weight, price, type) VALUES (6,'onion',10,35,'vegetable');*/
    }
}