insert into students(student_id, age, name, average, pc_id) values(2, 24, 'Hadi', 56, 2);
insert into students(student_id, age, name, average, pc_id) values(12, 15, 'Fadi', 86, 22);
insert into students(student_id, age, name, average, pc_id) values(24, 31, 'Eyas', 90, 42);

select * from students;

select S.age from students s where s.average > 80;

delete from students where student_id = 1;