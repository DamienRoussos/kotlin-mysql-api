CREATE DATABASE API;
USE API;

    CREATE TABLE IF NOT EXISTS customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    address_name VARCHAR(255) NOT NULL,
    address_number VARCHAR(10) NOT NULL,
    postal_code VARCHAR(10) NOT NULL,
    city VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    countr_code VARCHAR(10),
    phone_number VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    customer_type VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    product_type VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    image_url VARCHAR(255) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    availability VARCHAR(255) NOT NULL,
    delivery_type VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS store (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    store_name VARCHAR(255) NOT NULL,
    store_type VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    address_name VARCHAR(255) NOT NULL,
    address_number VARCHAR(10) NOT NULL,
    postal_code VARCHAR(10) NOT NULL,
    city VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    country_code VARCHAR(10) NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    image_url VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

    INSERT INTO customer (first_name, last_name, address_name, address_number, postal_code, city, country, countr_code, phone_number, email, password, customer_type)
    VALUES
('John', 'Doe', 'Main Street', '123', '12345', 'New York', 'United States', 'US', '+1-555-123-4567', 'john.doe@email.com', 'hashed_password_here', 'NEW'),
('Jane', 'Smith', 'Oak Avenue', '456', '67890', 'Los Angeles', 'United States', 'US', '+1-555-987-6543', 'jane.smith@email.com', 'hashed_password_here', 'RETURNING'),
('Maria', 'Garcia', 'Plaza Mayor', '789', '28001', 'Madrid', 'Spain', 'ES', '+34-555-123-456', 'maria.garcia@email.com', 'hashed_password_here', 'LOYAL');

INSERT INTO product (product_name, product_type, description, image_url, price, availability, delivery_type)
VALUES
    ('Laptop Pro X', 'ELECTRONICS', 'High-performance laptop with 16GB RAM', 'https://example.com/laptop.jpg', 1299.99, 'IN_STOCK', 'PICKUP'),
    ('Ham and Cheese Sandwich', 'SNACK', 'Ham and Cheese Sandwich in a toasted bun', 'https://example.com/sandwich.jpg', 4.99, 'OUT_OF_STOCK', 'DELIVERY'),
    ('Black Leather Jacket', 'CLOTHING', 'Black Leather Jacket - Size M', 'https://example.com/jacket.jpg', 79.99, 'LOW_STOCK', 'DELIVERY');

INSERT INTO store (store_name, store_type, description, address_name, address_number, postal_code, city, country, country_code, phone_number, email, image_url)
VALUES
    ('TechHub Central', 'ELECTRONICS', 'Your one-stop shop for electronics', 'Tech Street', '100', '10001', 'New York', 'United States', 'US', '+1-555-111-2222', 'techhub@store.com', 'https://example.com/techhub.jpg'),
    ('HomeGoods Plus', 'OTHER', 'Quality home goods and appliances', 'Market Square', '200', '90210', 'Los Angeles', 'United States', 'US', '+1-555-333-4444', 'homegoods@store.com', 'https://example.com/homegoods.jpg'),
    ('Global Electronics', 'ELECTRONICS', 'International electronics retailer', 'Commerce Road', '300', '28002', 'Madrid', 'Spain', 'ES', '+34-555-666-777', 'global@store.com', 'https://example.com/global.jpg');
