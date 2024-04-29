use gamedb;

select * from games 
order by price desc 
limit 1;

select * from games g1
where g1.price = (select max(g2.price) from games g2);

-- JSQL의 특징
-- * 아스테리스크 사용불가능. 별명을 이용하여 리턴해줘야함
-- from 테이블에 별명을 붙여줘야함. (g1)