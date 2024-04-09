CREATE TABLE IF NOT EXISTS CONTACT (
    document_number varchar(14) PRIMARY KEY,
    name VARCHAR(200),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    message VARCHAR(2000)
);