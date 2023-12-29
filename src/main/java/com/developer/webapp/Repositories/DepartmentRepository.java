package com.developer.webapp.Repositories;

import com.developer.webapp.Entities.Department;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
//    void updateDepartmentById(Long id, String Name);
}
