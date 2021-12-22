SELECT * FROM rohitdb.user;
SELECT * FROM rohitdb.department;
select * from user where salary>75000;
select user.name,department.name from user inner join department on user.department_id = department.department_id
	where department.name = 'operations'
;

select user.name as userName, department.name as departmentName from user inner join department on user.department_id = department.department_id;