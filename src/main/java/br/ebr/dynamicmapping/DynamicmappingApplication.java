package br.ebr.dynamicmapping;

import br.ebr.dynamicmapping.domain.Employee;
import br.ebr.dynamicmapping.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicmappingApplication implements CommandLineRunner {

	private final EmployeeRepository employeeRepository;

	public DynamicmappingApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DynamicmappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setTaxInPercents(25);
		employee.setTax(5);
		employee.setGrossIncome(10_000L);

		employeeRepository.save(employee);
	}

}
