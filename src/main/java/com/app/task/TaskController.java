package com.app.task;
import org.springframework.web.bind.annotation.CrossOrigin;
//
import java.util.List;
//
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.app.manager.Manager;
//
@RestController
@RequestMapping("/tasks")
@CrossOrigin("http://localhost:3000")
public class TaskController {
//	
//	@Autowired(required=true)
//	private RestTemplate restTemplate;
//	
	@Autowired
	private TaskRepo taskRepo;
//	
//	@Autowired 
//	private TaskDetailsRepo taskDetailsRepo;
//	
//	@Autowired TaskAssignRepo taskAssignRepo;
//	
//	@Value("${manager.service.url}")
//	private String managerServiceUrl;
//  
//	@Value("${employee.service.url}")
//	private String employeeServiceUrl;
//
//	@Value("${department.service.url}")
//	private String departmentServiceUrl;
//	
//	@PostMapping("/createtask/{managerId}")
//	public ResponseEntity<TaskDetails> createTask(@PathVariable Long managerId, @RequestBody TaskDetails taskDetails){
//		Manager manager = restTemplate.getForObject(
//				managerServiceUrl + "/managers/" + managerId,
//				Manager.class
//				);
//		if (manager == null) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Task task = new Task();
//		task.setTaskId(taskDetails.getTaskId());
//		task.setTaskTitle(taskDetails.getTaskTitle());
//		task.setTaskDescription(taskDetails.getTaskDescription());
//		task.setStartDate(taskDetails.getStartDate());
//		task.setEndDate(taskDetails.getEndDate());
//		task.setStatus(TaskStatus.UNASSIGNED);
//		task.setManagerId(managerId);
//		taskRepo.save(task);
//		
//		//taskDetails.setTaskId(task.getTaskId());
//		taskDetails.setManagerId(managerId);
//		TaskDetails savedTaskDetails = taskDetailsRepo.save(taskDetails);
//		
//		return ResponseEntity.ok(savedTaskDetails);
//		
//	}
//	
//	@PutMapping("/assigntask/{managerId}/{taskId}") 
//	public ResponseEntity<TaskAssign> assignTask(@PathVariable Long managerId, @PathVariable Long taskId, @RequestBody TaskAssign taskAssign){
//		
//		Task task = taskRepo.findById(taskId).orElseThrow();
//		if (task == null) {
//	        return ResponseEntity.notFound().build();
//	    }
//		
//		if(task.getManagerId() != managerId) {
//			 return ResponseEntity.notFound().build();
//		}		
//		
//		taskAssign.setManagerId(managerId);
//		taskAssign.setTask(task);
//		
//		TaskAssign savedTaskAssign = taskAssignRepo.save(taskAssign);
//		
//		if(task.getStatus().equals(TaskStatus.UNASSIGNED) && task.getEmployeeId().equals(null)) {
//			task.setStatus(TaskStatus.PENDING);
//			task.setEmployeeId(savedTaskAssign.getEmployeeId());
//
//		}
//		
//		taskRepo.save(task);
//		return ResponseEntity.ok(savedTaskAssign);
//	}
//	
//	@PutMapping("/accepttask/{employeeId}/{taskId}")
//	public ResponseEntity<Task> acceptTask(@PathVariable Long employeeId, @PathVariable Long taskId){
//		
//		Task task = taskRepo.findById(taskId).orElseThrow(null);
//		if(task==null) {
//	        return ResponseEntity.notFound().build();
//		}
//		
//		if(task.getEmployeeId().equals(employeeId) && task.getStatus().equals(TaskStatus.PENDING)) {
//			task.setStatus(TaskStatus.ACCEPTED);
//		}
//		
//		taskRepo.save(task);
//		
//		return ResponseEntity.ok(task);
//	}
//	
//	@PutMapping("/starttask/{employeeId}/{taskId}")
//	public ResponseEntity<Task> startTask(@PathVariable Long employeeId, @PathVariable Long taskId){
//		
//		Task task = taskRepo.findById(taskId).orElseThrow(null);
//		if(task==null) {
//	        return ResponseEntity.notFound().build();
//		}
//		
//		if(task.getEmployeeId().equals(employeeId) && task.getStatus().equals(TaskStatus.ACCEPTED)) {
//			task.setStatus(TaskStatus.STARTED);
//		}
//		taskRepo.save(task);
//		
//		return ResponseEntity.ok(task);
//	}
//	
//	@PutMapping("/completetask/{employeeId}/{taskId}")
//	public ResponseEntity<Task> completeTask(@PathVariable Long employeeId, @PathVariable Long taskId){
//		
//		Task task = taskRepo.findById(taskId).orElseThrow(null);
//		if(task==null) {
//	        return ResponseEntity.notFound().build();
//		}
//		
//		if(task.getEmployeeId().equals(employeeId) && task.getStatus().equals(TaskStatus.STARTED)) {
//			task.setStatus(TaskStatus.COMPLETED);
//		}
//		taskRepo.save(task);
//		
//		return ResponseEntity.ok(task);
//	}
//	
	@GetMapping("/employee/{employeeId}")
	public List<Task> viewTaskByEmployee(@PathVariable Long employeeId){
		return taskRepo.findByEmployeeId(employeeId);
	}
	
//	
	@GetMapping("/manager/{managerId}")
	public List<Task> viewTaskByManager(@PathVariable Long managerId){
		return taskRepo.findByManagerId(managerId);
	}
//	
}
