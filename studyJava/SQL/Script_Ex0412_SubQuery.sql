use testdb;


-- 1. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품명
select 제품명, 단가
from 제품
where 단가 = (select max(단가) from 제품)
order by 단가 desc
limit 1;

-- select 제품명, 단가
-- from 제품
-- where 단가 = (select max(단가) from 제품);	
		

-- 2. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품의 주문수량합
select 제품명, 제품.단가,
	 (select sum(주문수량) from 주문세부
	 where 제품.제품번호 = 주문세부.제품번호) "주문수량합"
from 제품
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호
where 제품.단가 = (select max(제품.단가) from 제품)
group by 제품명;

-- 선생님 답안
-- select sum(주문수량) 수량합
-- from 주문세부
-- where 제품번호 = (select 제품번호 from 제품 
-- 				where 단가 = (select max(단가) from 제품));


-- 3. '아이스크림' 제품의 주문수량합

select 제품명,
sum(주문수량) "주문수량합"
from 제품
inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호
where 제품명 like '%아이스크림'
group by 제품명
with rollup;


-- 선생님 답안
-- select sum(주문수량) 주문수량합
-- from 주문세부
-- where 제품번호 in (select 제품번호 from 제품
-- 				where 제품명 like '%아이스크림%');


-- 4. '서울특별시' 고객들에 대한 주문년도별 주문건수


-- join
select 도시,
	concat(year(주문.주문일)) "주문년도",
	count(주문.주문번호) "주문건수"
from 고객
inner join 주문
on 주문.고객번호 = 고객.고객번호
where 도시 = '서울특별시'
group by 도시, 주문년도;



-- subquery
select
	year(주문일) "주문년도",
	count(고객번호) "주문건수"
from 주문
where 고객번호 in (select 고객번호 from 고객
					where 도시 = '서울특별시')
group by 주문년도;


-- subquery
select 도시,
	concat(year(주문일)) "주문년도",
	count(주문번호) "주문건수"
from 주문
inner join (select 도시, 고객번호
				from 고객
				where 도시 = '서울특별시'
			) as 도시요약
on 주문.고객번호 = 도시요약.고객번호
group by 주문년도;


-- 선생님 답안
-- select year(주문일) as 주문년도,
-- 	count(*) as 주문건수
-- from 주문
-- where 고객번호 in (select 고객번호 from	고객
-- 				where 도시 = '서울특별시')
-- group by year(주문일);
-- 		







