CREATE DATABASE test
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;

CREATE SCHEMA tenant_1 AUTHORIZATION postgres;

CREATE SEQUENCE tenant_1.hibernate_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE tenant_1.hibernate_sequence OWNER TO postgres;

CREATE TABLE tenant_1.staff
(
  staffid bigint NOT NULL,
  roleid bigint NOT NULL,
  name character varying(255),
  account character varying(255),
  password character varying(255),
  CONSTRAINT staff_pkey PRIMARY KEY (staffid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tenant_1.staff OWNER TO postgres;

CREATE TABLE tenant_1.staffinfo
(
  staffinfoid bigint NOT NULL,
  staffid bigint NOT NULL,
  country character varying(255),
  province character varying(255),
  city character varying(255),
  address character varying(255),
  postcode character varying(255),
  orgemail character varying(255),
  orgfax character varying(255),
  landlinephone character varying(255),
  telephone character varying(255),
  sex character varying(255),
  birthday timestamp without time zone,
  createdate timestamp without time zone,
  CONSTRAINT staffinfo_pkey PRIMARY KEY (staffinfoid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tenant_1.staffinfo OWNER TO postgres;

INSERT INTO tenant_1.staff(staffid, roleid, name, account, password) 
VALUES (1, 1, 'staff1', 'staff1', 'staff1');

INSERT INTO tenant_1.staffinfo(staffinfoid, staffid, country, province, city, address, postcode, orgemail, orgfax, landlinephone, telephone, sex)
VALUES (1, 1, 'test', 'test', 'test', 'test', 'test', 'test', 'test', 'test', 'test', 'test');
