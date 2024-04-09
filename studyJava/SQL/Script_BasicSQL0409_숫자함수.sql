use testdb;

select ceiling(123.16),
	floor(123.56),
	round(123.56),
	round(123.56, 1),
	truncate(123.56,1); 
	

select abs(-120),
	sign(-120),
	sign(120);
	

select power(2, 3),
	sqrt(16),
	rand(),
	rand(100),
	rand(200);