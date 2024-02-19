package conversion.service;

import conversion.pojo.Employee;

public interface EmployeeService {
    void createEmployee(Employee employee);
    Employee getEmployee(Integer employeeId);
    void deleteEmployee(Integer employeeId);
}
