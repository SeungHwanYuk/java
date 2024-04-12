use testdb;

-- SubQuery
-- select문 내부에서 사용하는 select문을 의미함
-- 장점 : 복잡한 데이터추출 및 조작작업에 유용하며 유연성과 기능확장에 도움이 됨
-- 단점 : 지나치게 복잡한 서브쿼리를 사용하면 성능을 저하시킬 수 있음

-- 최고의 마일리지를 보유한 고객은 누구?
select 고객번호,
	고객회사명,
	담당자명,
	마일리지
from 고객
where 마일리지 = (select max(마일리지) from 고객);
-- 


-- 주문번호 'H0250'을 주문한 고객의 고객회사명과 담당자명
-- 1. 단일 행 SubQuery 사용 예
select 고객회사명, 담당자명
from 고객
where 고객번호 = (select 고객번호 from 주문
				where 주문번호 = 'H0250');
			
-- SubQurey -> inner join 사용 예
select 고객회사명, 담당자명
from 고객 
inner join 주문
on 고객.고객번호 = 주문.고객번호
where 주문번호 = 'H0250';
-- 


-- 2. 복수 (멀티) 행 SubQuery

-- in
-- '부산광역시' 고객이 주문한 주문건수
select count(*) "주문건수"
from 주문
where 고객번호 in (select 고객번호 from 고객
				where 도시 = '부산광역시');

-- any
-- '부산광역시' 전체고객의 마일리지보다 마일리지가 큰 고객의 정보
-- SubQuery의 결과값중 어느 하나만 커도 선택됨
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > any (select 마일리지 from 고객
				where 도시 = '부산광역시');

-- all
-- 각 지역의 어느 평균 마일리지보다도 마일리지가 큰 고객의 정보
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > all (select avg(마일리지) from 고객
				group by 지역);

-- exists
-- 한 번이라도 주문한적이 있는 고객의 정보
select 고객번호, 고객회사명
from 고객
where exists (select * from 주문
				where 고객.고객번호 = 주문.고객번호);
-- 

			
			
-- in (서브쿼리) 이용하여 동일한 결과 얻기
select 고객번호, 고객회사명
from 고객
where 고객번호 in (select 고객번호 from 주문 
					where 고객.고객번호 = 주문.고객번호)
				-- (select distinct 고객번호 from 주문)
order by 고객번호;

-- join을 이용하여 동일한 결과 얻기
select 고객.고객번호, 고객회사명
-- select distinnct (중복제거) 단일한 고객번호를 결과로 원하기에 사용가능
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호
group by 고객번호;
-- 



-- 서브쿼리는 where절 뿐만아니라 select, from, having 에도 사용 가능

-- having에 사용하는 예제
-- 고객 전체의 평균마일리지보다 평균마일리지가 큰 도시
select 도시,
	avg(마일리지) "평균마일리지"
from 고객
group by 도시
having avg(마일리지) > (select avg(마일리지) from 고객);
-- 



-- from에 사용하는 예제 (인라인뷰)
-- 담당자명, 고객회사명, 마일리지, 도시, 해당 도시의 평균마일리지
-- 도시의 평균마일리지와 각 고객의 마일리지의 차이도 함께 표현
select 담당자명,
	고객회사명,
	마일리지,
	고객.도시,
	도시평균마일리지,
	(도시평균마일리지 - 마일리지) "차이"
from 고객, (select 도시, avg(마일리지) "도시평균마일리지" from 고객
			group by 도시) as 도시별요약
where 고객.도시 = 도시별요약.도시;

-- 서브쿼리만 풀이
select 도시,
	avg(마일리지) "도시평균마일리지"
from 고객
group by 도시;
	
-- inner join 풀이
select 담당자명,
	고객회사명,
	마일리지,
	고객.도시,
	도시평균마일리지,
	(도시평균마일리지 - 마일리지) "차이"
from 고객 
inner join (select 도시, avg(마일리지) "도시평균마일리지" from 고객
			group by 도시) as 도시별요약
on 고객.도시 = 도시별요약.도시;
-- 



-- select에 사용하는 예제
-- 하나의 컬럼 값만 반환하는 쿼리여야 함(Scalar SubQuery)
-- 고객번호, 담당자명, 고객의 최종주문일
select 고객번호,
	담당자명,
	(select max(주문일) from 주문 where 주문.고객번호 = 고객.고객번호) "최종주문일"
from 고객;
-- 




-- 다중컬럼 서브쿼리
-- 서브쿼리에서 여러개의 컬럼을 사용하는 경우
-- 각 도시마다 최고 마일리지를 보유한 고객의 정보
select 도시,
	담당자명,
	고객회사명,
	마일리지
from 고객
where (도시, 마일리지) in (select 도시, max(마일리지)
						from 고객
						group by 도시);
-- 
					
					
					
-- 상관 서브쿼리 (Corelated SubQuery)
-- Main 쿼리와 Sub쿼리간의 상관관계를 포함하는 형태의 쿼리.
-- 상관서브쿼리는 메인쿼리와 한 행씩 실행하며 처리함.
-- 그렇기 때문에 실행속도가 늦어질 가능성이 있음
select 사원번호,
	이름,
	상사번호,
	(select 이름 from 사원 as 상사
	where 상사.사원번호 = 사원.사원번호) as "상사이름"
from 사원;

-- 특정 주문일 범위안에서 각 주문번호당 총 판매금액
select 주문번호, 주문일,
	(select sum(주문세부.주문수량 * 주문세부.단가) from 주문세부
			where 주문세부.주문번호 = 주문.주문번호 ) "총판매금액"
from 주문
where 주문일 between '2022-01-01' and '2022-12-31';
	
-- 위를 join으로 풀이 (비상관쿼리)
select 주문.주문번호 ,주문일,
	sum(주문세부.주문수량 * 주문세부.단가) "총판매금액"
from 주문
left outer join 주문세부
on 주문세부.주문번호 = 주문.주문번호
where 주문일 between '2022-01-01' and '2022-12-31'
group by 주문.주문번호, 주문.주문일;

-- '배재용' 사원의 부서명
-- 비상관쿼리
select 부서명
from 부서
where 부서번호=(select 부서번호 from 사원
				where 이름 = '배재용');
			
-- 상관쿼리
select (select 부서명 from 부서
		where 부서.부서번호 = 사원.부서번호) "부서명"
from 사원
where 이름 = '배재용';

-- 담당자명, 고객회사명, 주문건수 (count), 최초주문일(min), 최종주문일(max)
-- 서브쿼리 이용

select 
	(select 담당자명 from 고객
	where 주문.고객번호 = 고객.고객번호) "담당자명", 
	(select 고객회사명 from 고객
	where 주문.고객번호 = 고객.고객번호) "고객회사명",
	count(주문.주문번호) "주문건수",
	min (주문.주문일) "최초주문일",
	max(주문.주문일) "최종주문일"
from 주문
group by 담당자명,고객회사명
order by 담당자명;


select 담당자명,고객회사명,주문건수,최초주문일,최종주문일
from 고객
inner join (select 고객번호,
				count(*) as 주문건수,
				min(주문일) as 최초주문일,
				max(주문일) as 최종주문일
			from 주문
			group by 고객번호) as 주문요약
on 주문요약.고객번호 = 고객.고객번호
order by 담당자명;




























