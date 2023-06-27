package br.ebr.dynamicmapping;

import br.ebr.dynamicmapping.domain.Employee;
import br.ebr.dynamicmapping.domain.Phone;
import br.ebr.dynamicmapping.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;

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
		Phone phone1 = new Phone();
		phone1.setDeleted(false);
		phone1.setId(1);
		phone1.setNumber("31997779822");

		Phone phone2 = new Phone();
		phone2.setDeleted(false);
		phone2.setId(2);
		phone2.setNumber("31997779856");

		var phones = new HashSet<Phone>();
		phones.add(phone1);
		phones.add(phone2);

		Employee employee = new Employee();
		employee.setId(1);
		employee.setTaxInPercents(25);
		employee.setTax(5);
		employee.setGrossIncome(10_000L);
		employee.setPhones(phones);

		employeeRepository.save(employee);
	}

}
