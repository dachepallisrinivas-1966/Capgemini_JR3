package com.cg.jh04.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employees4")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value = "E")

//@Entity
//@Table(name="all_employees_table")
//@Inheritance(strategy=InheritanceType.JOINED)

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_no")
	private Long empNumber;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="salary")
	private Double empSalary;
	
	public Employee() {
		/* Default constructor */
	}

	public Employee(String empName, Double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Long getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Long empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return String.format("Employee [empNumber=%s, empName=%s, empSalary=%f]", empNumber, empName, empSalary);
	}
	
	
	

}