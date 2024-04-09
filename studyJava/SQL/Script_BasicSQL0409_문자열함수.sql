


-- char_length 문자의 갯수
-- length 바이트 수
select char_length('hello'),
	length('hello'),
	char_length('안녕'),
	length('안녕');
	


-- concat 문자열 더하기
-- concat_ws 문자열을 구분자('-')와 함께 연결 (ws= with separator) 구분자는 첫번째 값으로 지정됨
select concat('dreams','come','true'),
	concat_ws('-','2023','01','29'); 
	


-- left 문자열의 왼쪽부터 갯수
-- right 문자열의 오른쪽부터 갯수
-- substr ?번째 부터 갯수. 갯수선언이 없으면 끝까지
select left('SQL 공부', 3),
	right('SQL 공부', 2),
	substr('SQL 공부', 3 , 4),
	substr('SQL 공부',5);
	


-- substring_index 구분자(' ')를 만날때 까지 문자열을 잘라냄
-- index는 ?번재 구분자(' ')를 만날때까지 자를지를 결정. 구분자는 두번째 값으로 지정됨
-- index가 음수면 오른쪽부터(반대)
select substring_index('서울시 동작구 흑석동',' ', 1);
select substring_index('서울시 동작구 흑석동',' ', 2); 
select substring_index('서울시 동작구 흑석동',' ', -1); 
select substring_index( 
	substring_index('서울시 동작구 흑석동',' ', 2), ' ', -1); -- 동작구(중간) 출력
	
	
	
-- lpad, rpad
-- 지정한 길이에서 문자열을 제외한 나머지를 특수문자로 채움. lpad은 왼쪽, rpad은 오른쪽 부터
select lpad('sql',10,'#'),
	rpad('sql',5,'*'); 



-- trim, ltrim, rtrim
-- ltrim은 왼쪽, rtrim은 오른쪽부터 공백 제거
-- trim 양쪽 공백 제거
select ltrim('     sql'),
	rtrim('sql     '), 
	trim('   sql   ');



-- field 문자열의 위치를 찾음
-- field(찾는 문자열, 문자열1, 문자열2, 문자열3, .....)
-- find_in_set 문자열 리스트에서 지정한 문자열을 찾음
-- find_in_set (찾는 문자열,문자열 리스트)
select field('java','sql','java','javascript');
select find_in_set('java','sql,java,javascript');



-- locate 기준문자열에서 부분문자열의 위치를 찾음
-- locate(부분문자열, 기준문자열)
select locate('world', 'hello world.');


-- elt 지정한 위치(인덱스)에있는 문자열을 반환
select elt(2,'sql','java','javascript');


-- repeat 문자열의 반복
select repeat ('*', 5);


-- replace 문자열의 일부를 다른 문자열로 대체
-- replace(기준문자열, 바꿀 문자열, 바뀔 문자열)
select replace('010_1234_5678','_','-');


-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); 













