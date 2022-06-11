package repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import entity.EmployeeEntity;

public class EmployeeRepository extends JpaRepositoryExtension<EmployeeEntity, Long>{

}
