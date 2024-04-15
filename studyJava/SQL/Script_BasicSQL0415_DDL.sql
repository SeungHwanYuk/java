
-- DDL(데이터 정의어)
-- create, alter, drop, truncate

/*
 문자형 데이터타입
char 고정길이 255
varchar 가변길이 65535
tinytext 255
text 65535
mediumtext 16,777,215
longtext 4, 294, 967, 295
json 1Gb 
*/


/*
숫자형 데이터타입
tinyint 1byte
smallint 2byte
mediumint 3byte
int 4byte
bigint 8byte

float 4byte (소수점 아래 7자리)
double 9byte (소수점 아래 15자리)
decimal(전체자릿수, 소수점자릿수)
*/


/*
날짜시간형 데이터타입
date YYYY-MM-DD
time HH:MI:SS
datetime YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS
*/


/*
이진형(binary) 데이터타입 : 이미지, 오디오, 비디오등
tinyblob 255byte (blob = binary large object)
blob 65535byte
medium blob 16,777,215byte
longblob 4,294,967,295byte
*/


-- create 데이터베이스 생성
create database project1;
-- char set utf8mb4 collate utf8mb4_general_ci; 데이터베이스 언어설정

use project1;


-- 테이블 생성
create table 학과
(학과번호 char(2), 학과명 varchar(20), 학과장명 varchar(20))
default character set UTF8mb4;
-- 한글로 개체입력시 default값 지정을 위해 테이블 생성 단계에서 default character set UTF8mb4; 입력

insert into 학과
values('AA', '컴퓨터공학과', '배경민'),
	('BB', '소프트웨어학과', '김남준'),
	('CC', '디자인융합학과', '박선영');

create table 학생 
(학번 char(5), 이름 varchar(20), 생일 date, 
연락처 varchar(20), 학과번호 char(2));

insert into 학생
values('S0001', 'Lee', '2020-01-30', '01033334444', 'AA'); 
insert into 학생
values('S0002', 'Kim', '2020-02-23', null, 'AA'),
	('S0003', 'Bak', '2020-03-31', '01077778888null', 'DD');
-- 



-- alter 테이블명이나 컬럼명, 데이터타입을 변경하거나 컬럼 추가, 삭제
-- 컬럼추가
alter table 학생 add 성별 char(1);

-- 컬럼 데이터타입 변경
alter table 학생 modify column 성별 varchar(2);

-- 컬럼명 변경
alter table 학생 change column 연락처 핸드폰전화번호 varchar(20);

-- 컬럼 삭제
alter table 학생 drop column 성별;

-- 테이블명 변경
alter table 학생 rename 재학생;
-- 



-- 3. drop 데이터베이스 또는 테이블 삭제
create database temp;
drop database temp;

create table 휴학생
(학번 char(5), 이름 varchar(20), 생일 date,
연락처 varchar(20), 학과번호 char(2));

drop table 휴학생;









