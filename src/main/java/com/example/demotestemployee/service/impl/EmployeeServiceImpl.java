package com.example.demotestemployee.service.impl;

import com.example.demotestemployee.model.Department;
import com.example.demotestemployee.model.Dependent;
import com.example.demotestemployee.model.Employee;
import com.example.demotestemployee.repository.DepartmentRepository;
import com.example.demotestemployee.repository.DependentRepository;
import com.example.demotestemployee.repository.EmployeeRepository;
import com.example.demotestemployee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final DependentRepository dependentRepository;

    @Override
    public void create() {

    }

    @Override
    public void save() {
        Department department = new Department();
        department.setName("IT");

        Department department1 = new Department();
        department1.setName("ART");

        Department department2= new Department();
        department2.setName("BM");

        departmentRepository.save(department);
        departmentRepository.save(department1);
        departmentRepository.save(department2);

    }

    @Override
    public void saveEmployeeDepartment() {

        Department department = new Department();
        department.setId(2L);

        Employee employee = new Employee();

        employee.setName("Lahiru");

        employee.getDepartments().add(department);  //department list eka aragena eka athulata ara ewapu departmnet eke id eka denwa set krnn yana depaartment eka //
                                                    // eka api udin gaththe udin gaththa kiynne ekata thama setkaare hard cord karala id ekk 1L kiyl
                                                    // 1L kiyana department ekata employeewa set karnna ynne me

        employeeRepository.save(employee);

    }

    @Override
    public void addEmployeeDepartment2(long departmentId) {

        Optional<Department> departmentOptional = departmentRepository.findById(departmentId);

        if (departmentOptional.isPresent()){
            Department department = departmentOptional.get();

            Employee employee = new Employee();

            employee.setName("Piyal");
            employee.getDepartments().add(department);

            employeeRepository.save(employee);
        }
    }

    @Override
    public void addDependentForEmployee() {

        Dependent dependent1 = new Dependent();
        Dependent dependent2 = new Dependent();

        dependent1.setName("shehan");
        dependent2.setName("dinesh");

        Employee employee = new Employee();

        employee.setName("supun");

        employee.getDependents().add(dependent1);   //methana me wenne dn dependenet list kiyl thiyena list eka aran ekata thama me dependent wa add karanne
                                                    // list ekakata dpendent la wa add krnne(dependentList.add(department)
                                                    // me wenuwata emp.setDepartmentList() gaththoth wenne ara thiyena list eka ayin wela aluth list ekkma ena eka..

        employee.getDependents().add(dependent2);   //me karala thiyenne ara kalin list ekatama thawa dependent kenek add karala

        dependent1.setEmployee(employee);
        dependent2.setEmployee(employee);

        employeeRepository.save(employee);
    }

}
