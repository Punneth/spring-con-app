package conversion.service.impl;

import conversion.constants.ErrorCodeEnum;
import conversion.dao.EmployeeDao;
import conversion.exception.EmployeeException;
import conversion.pojo.Employee;
import conversion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void createEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public Employee getEmployee(Integer employeeId) {
        if (null == employeeId ) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, ErrorCodeEnum.EMPLOYEE_ID_ISNULL.getErrorCode(),
                    ErrorCodeEnum.EMPLOYEE_ID_ISNULL.getErrorMessage());
        }
        Optional<Employee> employee = employeeDao.findById(employeeId);
        if (!employee.isPresent()) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, ErrorCodeEnum.EMPLOYEE_NOT_EXIST.getErrorCode(),
                    ErrorCodeEnum.EMPLOYEE_NOT_EXIST.getErrorMessage());
        }

        return employee.get();
    }

    @Override
    public void deleteEmployee(Integer employeeId) {

        if (null == employeeId ) {
            throw new EmployeeException(HttpStatus.BAD_REQUEST, ErrorCodeEnum.EMPLOYEE_ID_ISNULL.getErrorCode(),
                    ErrorCodeEnum.EMPLOYEE_ID_ISNULL.getErrorMessage());
        }
        employeeDao.deleteById(employeeId);
    }
}
