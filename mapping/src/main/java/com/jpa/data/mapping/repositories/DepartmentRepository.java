package com.jpa.data.mapping.repositories;

import com.jpa.data.mapping.entities.DepartmentEntity;
import com.jpa.data.mapping.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
