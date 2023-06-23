package br.ebr.dynamicmapping.service;

import br.ebr.dynamicmapping.domain.Employee;
import br.ebr.dynamicmapping.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee findById(Integer employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow();
    }

}
