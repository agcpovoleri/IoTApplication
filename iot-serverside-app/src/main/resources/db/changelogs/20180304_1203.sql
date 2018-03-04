--liquibase formatted sql

--changeset clubeviajante:v1 logicalFilePath:20180304_1203.sql
-- Table: sensor_data
CREATE TABLE SENSOR_DATA
(
  ID serial NOT NULL,
  SOURCE_UID character varying(40),
  CATEGORY character varying(50),
  CONTENT character varying(100),
  CREATE_TIMESTAMP timestamp without time zone DEFAULT now(),
    CONSTRAINT sensor_data_pk PRIMARY KEY (id )
);
