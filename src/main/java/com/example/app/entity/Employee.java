package com.example.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;






@Entity
@Table
public class Employee {
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
		
	@Column(name="ename")
	private String empName;
		
	@Column(name="egen")
	private String empGen;
		
	@Column(name="edept")
	private String empDept;
		
	@Column(name="esal")
	private Double empSal;
		
	@Column(name="email")
	private String email;
		
	@Column(name="Doj")
	@DateTimeFormat(iso= ISO.DATE)
	@Temporal(TemporalType.DATE)
	private Date empDoj;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, String empGen, String empDept, Double empSal, String email,
			Date empDoj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGen = empGen;
		this.empDept = empDept;
		this.empSal = empSal;
		this.email = email;
		this.empDoj = empDoj;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEmpDoj() {
		return empDoj;
	}

	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	
}
