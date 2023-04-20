package com.rest1.rest1.Ques2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmpController {
    private EmpDAO emp;

    public EmpController(EmpDAO ed) {
        this.emp = ed;
    }

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee() {
        return emp.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployeeById(@PathVariable Integer id) {
        Employee ep = emp.getEmployeeById(id);
        if (ep == null)
            throw new EmpNotFoundException("id" + id);
        return ep;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(@PathVariable Integer id) {
        emp.deleteEmployeeById(id);
    }

    @PostMapping("/emp")
    public void createUser(@RequestBody Employee emp) {
        this.emp.save(emp);
    }

    @PutMapping("/emps/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee emp){
        Employee ep = this.emp.getEmployeeById(id);
        ep.setAge(emp.getAge());
        ep.setId(emp.getId());
        ep.setName(emp.getName());
        final Employee updatedEmp = this.emp.save(ep);
        return ResponseEntity.ok(updatedEmp);
    }
}
