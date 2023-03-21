
-- Create a new database
CREATE DATABASE mydb;

-- Create a new table
CREATE TABLE posts (
    id INTEGER PRIMARY KEY,
    body TEXT,
    post_id INTEGER UNIQUE,
    username VARCHAR(50),
    updated_at TIMESTAMP
);

INSERT INTO posts (id, body, post_id, username, updated_at)
VALUES
    (1, 'This is the first post', 1, 'user1', '2022-01-01 10:00:00'),
    (2, 'This is the second post', 2, 'user2', '2022-01-02 11:00:00'),
    (3, 'This is the third post', 3, 'user3', '2022-01-03 12:00:00'),
    (4, 'This is the fourth post', 4, 'user4', '2022-01-04 13:00:00');