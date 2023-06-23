package br.ebr.dynamicmapping.controller;

import br.ebr.dynamicmapping.domain.Employee;
import br.ebr.dynamicmapping.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{employeeId}")
    public Employee findById(@PathVariable Integer employeeId) {
        return service.findById(employeeId);
    }

}
