package com.app.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDetailsRepo extends JpaRepository<TaskDetail, Long>{
	
}
