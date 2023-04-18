package com.javabytes.springh2demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long empId;
	public String empName;
	public String empDesignatiion;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Long empId, String empName, String empDesignatiion) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignatiion = empDesignatiion;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignatiion() {
		return empDesignatiion;
	}
	public void setEmpDesignatiion(String empEmail) {
		this.empDesignatiion = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empDesignatiion + "]";
	}
	
	

}
