package edu.ijse.todo.repository;

import edu.ijse.todo.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Integer> {
}
