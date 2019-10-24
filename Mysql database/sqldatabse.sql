use sqlpractice;
show Tables
desc Employ

select * from employ

select empno, name, basic from employ
 select * from employ Where basic>5000
 select * from employ Where dept='java'
 select * from employ Where basic between 40000 and 50000
  select * from employ Where basic  not between 40000 and 50000
  select * from employ Where name not in('k')
  select * from employ Where dept in('dotnet')
  select * from employ order by dept ASC
    select * from employ order by dept,name  ASC
      select * from employ order by dept  asc,name DESC
      
      select empno,name,basic
      from employ Where basic between 40000 and 60000
      
      select empno,name,basic
      from employ Where basic between 50000 and 85000
      
       select empno,name,basic
      from employ Where basic between 40000 and 60000
      UNION
      select empno,name,basic
      from employ Where basic between 50000 and 85000
      
       select empno,name,basic
      from employ Where basic between 40000 and 60000
      UNION ALL
      select empno,name,basic
      from employ Where basic between 50000 and 85000
      
       select empno,name,basic
      from employ Where basic between 40000 and 60000
      INTERSE
      select empno,name,basic
      from employ Where basic between 50000 and 85000
      