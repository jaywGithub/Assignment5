package za.ac.cput.jayson.services.employee.Implementation;

import za.ac.cput.jayson.domain.employee.Employee;
import za.ac.cput.jayson.domain.employee.RegularDriver;
import za.ac.cput.jayson.factories.employee.EmployeeLicenseFactory;
import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class RegularLicenseService implements LicenseService {
    public Employee getLicense() {
        RegularDriver regularDriver = new RegularDriver();
        EmployeeLicenseFactory employeeLicenseFactory = new EmployeeLicenseFactory();

        regularDriver.setName("Bobby");
        regularDriver.setSurname("Anderson");
        regularDriver.setLicense("B");

        return regularDriver;
    }
}
