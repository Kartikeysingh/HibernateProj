package com.prac.entitymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID")
	private int empId;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "VEHICLE_ID") private Vehicle vehicle;
	 */

	@OneToMany
	@JoinTable(name = "VEHICLE_LIST", joinColumns = @JoinColumn(name = "EMP_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	private List<Vehicle> listOfVehicles = new ArrayList<>();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}

	public void setListOfVehicles(List<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	/*
	 * public Vehicle getVehicle() { return vehicle; }
	 * 
	 * public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
	 */

}
