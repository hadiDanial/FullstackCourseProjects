insert into products(barcode, name, price, description) values (1, 'Bread', 1, 'A piece of bread.');
insert into products(barcode, name, price, description) values (2, 'Apple', 10, 'An apple!');
insert into products(barcode, name, price, description) values (3, 'Cola', 20, 'A bottle of cola');
insert into products(barcode, name, price, description) values (4, 'iPhone', 3500, 'An iPhone. How expensive...');
insert into products(barcode, name, price, description) values (5, 'Cake', 50, 'Yummy!');
insert into products(barcode, name, price, description) values (6, 'Chocolate bar', 3, 'Tasty');


Select * from products;

Select * from products where price > 10;

Select * from products where barcode = 2;