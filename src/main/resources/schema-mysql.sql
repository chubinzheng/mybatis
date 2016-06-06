DROP TABLE IF EXISTS t_city;
CREATE TABLE t_city (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  state varchar(255) DEFAULT NULL,
  country varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
