package com.javainterviewpoint;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e join fetch e.employeeAddress ea where ea.country =:country")
	List<Employee> findEmpByCountry(@Param("country") String country);
	
	@Query("select distinct e from Employee e join fetch e.employeeAddress ea where ea.country=:country order by ea.state Asc")
	List<Employee> findEmpByStateDesc(@Param("country") String country);
	
	@Query("select distinct e from Employee e join fetch e.employeeAddress ea where ea.state=:state order by ea.city Desc")
	List<Employee> findEmpBycityDesc(@Param("state") String state);
}
