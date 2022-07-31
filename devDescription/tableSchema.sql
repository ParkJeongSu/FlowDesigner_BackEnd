-- 모델러 계정 생성 테스트

alter session set "_ORACLE_SCRIPT"=true;

create user modeler1 identified by modeler1;

grant create session to modeler1;

grant connect, resource, DBA to modeler1;

alter user modeler1 default tablespace users quota unlimited on users;

-- MESFactoryList
CREATE TABLE MESFACTORY
(
    FACTORYNAME VARCHAR2(40)
);

ALTER TABLE MESFACTORY ADD CONSTRAINT MESFACTORY_pk PRIMARY KEY (FACTORYNAME);

COMMENT ON
TABLE MESFACTORY IS 'FACTORY';

COMMENT ON
COLUMN MESFACTORY.FACTORYNAME IS 'FACTORYNAME';
