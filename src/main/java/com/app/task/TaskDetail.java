package com.app.task;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="taskcreate")
public class TaskDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    
   
	private String taskTitle;
	private String taskDescription;
	private LocalDate startDate;
	private LocalDate endDate;
	private Long managerId;
	
	public TaskDetail() {}
	

	public TaskDetail(Long taskId,/* Task task,*/ String taskTitle, String taskDescription, LocalDate startDate,
			LocalDate endDate, Long managerId, TaskStatus status) {
		super();
		this.taskId = taskId;
		//this.task = task;
		this.taskTitle=taskTitle;
		this.taskDescription = taskDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.managerId = managerId;
	}


	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

//	public Task getTask() {
//		return task;
//	}
//
//	public void setTask(Task task) {
//		this.task = task;
//	}


	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getTaskTitle() {
		return taskTitle;
	}


	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
}
