package com.cg.sbwrcd.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sbwrcd.entity.Department;
import com.cg.sbwrcd.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

	boolean existsByMobileNumber(String mobileNumber);
	boolean existsByEmail(String email);
	
	
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmail(String email);
	List<Employee> findAllByDept(Department dept);
	List<Employee> findAllByJoinDate(LocalDate joinDate);
	
	@Query("SELECT e FROM Employee e WHERE e.basic > :lb AND e.basic < :ub")
	List<Employee> findAllByBasicRange(double lb, double ub);
}
