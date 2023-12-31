package br.ebr.dynamicmapping.repository;

import br.ebr.dynamicmapping.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
