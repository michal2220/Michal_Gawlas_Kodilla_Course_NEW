INSERT INTO posts (USER_ID, BODY)
VALUES (1, "What's up Thomas!?");

SELECT * FROM posts;

UPDATE posts
SET BODY = "To delete."
WHERE ID = 7;

SELECT * FROM posts;

DELETE FROM posts
WHERE ID =7;

SELECT * FROM posts;

COMMIT;