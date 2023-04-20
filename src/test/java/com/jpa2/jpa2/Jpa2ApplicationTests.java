package com.jpa2.jpa2;

import com.jpa2.jpa2.componentMapping.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.jpa2.jpa2.componentMapping.EmployeeRepo;
import com.jpa2.jpa2.componentMapping.Salary;
import com.jpa2.jpa2.inheritanceMapping.TwoWheeler;
import com.jpa2.jpa2.inheritanceMapping.VehicleRepo;
import com.jpa2.jpa2.jpql_native.EmpRepo;
import com.jpa2.jpa2.jpql_native.Employe;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@SpringBootTest
class Jpa2ApplicationTests {

	@Autowired
	EmpRepo repo;
	@Autowired
	EmployeeRepo empRepo;
	@Autowired
	VehicleRepo vehicleRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employe emp = new Employe();
		emp.setAge(21);
		emp.setFirstName("Rashi");
		emp.setLastName("Sharma");
		emp.setSalary(50000d);
		repo.save(emp);
	}

	@Test
	public void testFindAllEmployee(){
		List<Object[]> allEmp = repo.findAllEmploye();
		for (Object[] obj : allEmp) {
			System.out.print(obj[0]);
			System.out.println(obj[1]);
		}
	}

	@Test
	public void testUpdateAllEmployeSalary(){
		repo.updateEmployeBySalary(4000d,repo.avgSalary());
	}

	@Test
	public void testDeleteEmploye(){
		repo.deleteEmployeWithMinSalary(repo.minSalary());
	}

	@Test
	public void testFindAllEmployeLike(){
		List<Object[]> lt = repo.findAllEmployeLikeNQ();
		for (Object[] obj : lt) {
			System.out.print(obj[0]);
			System.out.print(obj[1]);
			System.out.println(obj[2]);
		}
	}

	@Test
	public void testDeleteEmployeByAge(){
		repo.deleteEmployeByAge(45);
	}

	//INHERITANCE MAPPING
	@Test
	public void testCreateVehicleEntity(){
		TwoWheeler veh = new TwoWheeler();
		veh.setSpeed(20);
		veh.setVehicleNo("DL-1234S");
		veh.setSeats(2);
		veh.setWheels(2);

		vehicleRepo.save(veh);
	}

	//COMPONENT TESTING
	@Test
	public void testComponentMapping(){
		Employee e = new Employee();
		e.setId(1);
		e.setAge(20);
		e.setFirstName("Rashi");
		e.setLastName("Sharma");
		Salary sal = new Salary();
		sal.setBasicSalary(200000);
		sal.setBonusSalary(3500f);
		sal.setSpecialAllowanceSalary(250.67f);
		sal.setTaxAmount(200.54f);
		e.setSalary(sal);

		empRepo.save(e);
	}
}
