show tables

desc emp

/* dispaly all records to the emp table */
select * from emp

/* display empno, ename, and salary from emp table */
select 
      empno,
      ename,
      sal
      from emp
      
      select
       empno,
       ename,
       sal,
       sal+1000,
       sal-1000
       from emp
       
       desc dept
       
       select * from dept
       
       select
        deptno,
        dname,
        loc
        from dept
        
        /* display all records whose sal > 2000 */
        select * from emp
        where sal > 2000
        
        /* display all records whose job is 'clerk' */
        select * from emp
        where job = 'clerk'
        
          /* display all records whose job is 'manager' */
         select * from emp
        where job = 'manager'
        
        /* between....and */
        select * from emp
        where sal between 1000 and 2000
        
        select * from emp
        where sal not between 1000 and 2000
        
        select * from emp
        where hiredate between '1980-01-01'
        and '1982-12-31'
        
        select * from emp
        where hiredate not between '1980-01-01'
        and '1982-12-31'
        
        select * from emp
        where job in('clerk', 'salesman', 'manager')
        
        select * from emp
        where job not in('clerk', 'salesman', 'manager')
        
        select * from emp
        where sal in(1000, 5000)
        
        select * from emp
        where sal not in(1000, 5000)
        
        
        select
        empno,
        ename,
        job,
        sal
        from emp
        order by job, ename
        
		select
        empno,
        ename,
        job,
        sal
        from emp
        order by job, ename desc
        
        select distinct job from emp
        
        select
        empno,
        ename,
        job,
        case job
		  when 'clerk' then 'darshini'
          when 'salesman' then 'visali'
          when 'manager' then 'rishab'
		  when 'analyst' then 'vinod'
		  when 'president' then 'no manager'
        end 'manager'
		from emp
        
        select
        empno,
        ename,
        job,
        sal,
        case job
		  when 'clerk' then sal+500
          when 'salesman' then sal+600
          when 'manager' then sal+1000
		  when 'analyst' then sal+1500
		  when 'president' then sal
        end 'inc sal'
		from emp
        
        
        