package com.hcl.springData;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	@Query("select e from Employee e where dept=?1 and desig=?2")
	List<Employee> findByDeptAndDesig(String dept, String desig);

	@Query("select e from Employee e where dept=?1 and basic=?2")
	List<Employee> findByDeptAndBasic(String dept, int basic);

	@Query("select e from Employee e where dept=?1")
	List<Employee> findByDept(String dept);
	
	@Query("select e from Employee e where basic>=?1")
	List<Employee> findByBasic(int basic);
	
	@Query("select e from Employee e where basic<=?1 and name LIKE 'R%'")
	List<Employee> findByBasicAndName(int basic, String name);
}
