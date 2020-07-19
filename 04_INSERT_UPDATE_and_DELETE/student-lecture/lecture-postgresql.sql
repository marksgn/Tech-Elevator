-- INSERT

-- 1. Add Klingon as a spoken language in the USA
-- 2. Add Klingon as a spoken language in Great Britain
select * FROM countrylanguage;

INSERT INTO countrylanguage (countrycode, language, isOfficial, percentage)
VALUES('USA', 'Klingon', false, 1.2);

select * from country where name LIKE '%United Kingdom'

INSERT INTO countrylanguage (countrycode, language, isOfficial, percentage)
VALUES('GBR', 'Klingon', false, 1.2 );

-- UPDATE

-- 1. Update the capital of the USA to Houston
-- 2. Update the capital of the USA to Washington DC and the head of state


-- DELETE

-- 1. Delete English as a spoken language in the USA
-- 2. Delete all occurrences of the Klingon language 
DELETE 
FROM countrylanguage
WHERE language = 'Klingon';


-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage(language)
VALUES('Elvish')

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO COUNTRYLANGUAGE (countrycode, language, isOfficial, percentage)
VALUES ('ZZZ', 'English', true, 10);

-- 3. Try deleting the country USA. What happens?
DELETE
FROM country
WHERE code = 'USA';


-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.

-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.