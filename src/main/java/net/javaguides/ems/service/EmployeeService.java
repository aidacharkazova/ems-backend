package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;


public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto> getEmployees();
    EmployeeDto updateEmployee(Long id, EmployeeDto updatedemployeeDto);
    void deleteEmployee(Long id);
}
