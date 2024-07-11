package com.springbootprj.customerrelationshipmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootprj.customerrelationshipmanagement.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}