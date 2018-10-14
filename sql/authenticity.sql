-- Just for test
CREATE TABLE authenticity (
   name      TEXT  PRIMARY KEY NOT NULL,
   password  TEXT NOT NULL,
   cfg       TEXT NOT NULL,
   role_id   int REFERENCES role(id)
);