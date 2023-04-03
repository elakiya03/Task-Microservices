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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name="task")
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	
	private String taskTitle;
	private String taskDescription;
	private LocalDate startDate;
	private LocalDate endDate;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private TaskStatus status;
	
	private Long managerId;
	private Long employeeId;
	private String employeeName;	
	
}
