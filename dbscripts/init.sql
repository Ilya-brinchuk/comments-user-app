-- Create a new database
CREATE
DATABASE db;

-- Create a new table
CREATE TABLE posts
(
    id         INTEGER UNIQUE,
    body       TEXT,
    postId    INTEGER UNIQUE,
    username   VARCHAR(50),
    updatedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);