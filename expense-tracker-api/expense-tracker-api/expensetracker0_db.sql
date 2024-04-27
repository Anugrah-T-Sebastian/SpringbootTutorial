-- Comment out DROP statements since the objects might not exist yet
-- DROP DATABASE expensetrackerdb;
-- DROP USER expensetracker;

-- Create user with password
CREATE USER expensetracker WITH PASSWORD 'password';

-- Create database owned by the user
CREATE DATABASE expensetrackerdb OWNER = expensetracker;

-- Connect to the database
\c expensetrackerdb;

-- Grant permissions on tables and sequences
ALTER DEFAULT PRIVILEGES FOR ROLE expensetracker GRANT ALL ON TABLES TO expensetracker;
ALTER DEFAULT PRIVILEGES FOR ROLE expensetracker GRANT ALL ON SEQUENCES TO expensetracker;

-- Create tables if they don't exist
CREATE TABLE IF NOT EXISTS et_users (
    user_id SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    email VARCHAR(30) NOT NULL,
    password TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS et_categories (
    category_id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    title VARCHAR(20) NOT NULL,
    description VARCHAR(50) NOT NULL,
    CONSTRAINT cat_users_fk FOREIGN KEY (user_id) REFERENCES et_users(user_id)
);

CREATE TABLE IF NOT EXISTS et_transactions (
    transaction_id SERIAL PRIMARY KEY,
    category_id INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    amount NUMERIC(10, 2) NOT NULL,
    note VARCHAR(50) NOT NULL,
    et_transaction_date BIGINT NOT NULL,
    CONSTRAINT trans_cat_fk FOREIGN KEY (category_id) REFERENCES et_categories(category_id),
    CONSTRAINT trans_users_fk FOREIGN KEY (user_id) REFERENCES et_users(user_id)
);

-- Create sequences if they don't exist
CREATE SEQUENCE et_users_seq INCREMENT 1 START 1;
CREATE SEQUENCE et_categories_seq INCREMENT 1 START 1;
CREATE SEQUENCE et_transactions_seq INCREMENT 1 START 1000;