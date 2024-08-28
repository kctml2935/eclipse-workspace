DROP TABLE product CASCADE CONSTRAINTS;

CREATE TABLE product(
		no                            		NUMBER(10)		 NULL ,
		name                          		VARCHAR2(50)		 NULL ,
		short_desc                    		VARCHAR2(255)		 NULL ,
		price                         		NUMBER(10.3)		 NULL ,
		ipgo_date                     		DATE		 DEFAULT sysdate 	NULL
);



ALTER TABLE PRODUCT ADD CONSTRAINT IDX_PRODUCT_PK PRIMARY KEY (no);

