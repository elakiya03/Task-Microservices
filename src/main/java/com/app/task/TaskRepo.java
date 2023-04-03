package com.app.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long>{
	
	List<Task> findByEmployeeId(Long employeeId);
	List<Task> findByManagerId(Long managerId);
}
