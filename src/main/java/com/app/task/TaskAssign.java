package com.app.task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="taskassign")
public class TaskAssign {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@OneToOne
	@JoinColumn(name="taskId")
	private Task task;
	
	private Long managerId;
	private Long employeeId;
	
	public TaskAssign() {}
	
	public Long getId() {
		return Id;
	}
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public void setId(Long taskId) {
		this.Id = taskId;
	}

	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public TaskAssign(Long taskId, Task task, Long managerId, Long employeeId) {
		super();
		this.Id = taskId;
		this.task = task;
		this.managerId = managerId;
		this.employeeId = employeeId;
	}
	
}
