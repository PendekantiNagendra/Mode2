use bank

select
case
 when max(accountNo) is null then 1
 else max(accountNo + 1)
 end accno
 from accounts