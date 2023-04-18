package assignment1.empRepo;

import assignment1.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee,Integer> {

}
