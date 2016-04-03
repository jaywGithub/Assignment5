package za.ac.cput.jayson.services.employee.Implementation;

import za.ac.cput.jayson.domain.employee.Employee;
import za.ac.cput.jayson.domain.employee.Express2Driver;
import za.ac.cput.jayson.factories.employee.EmployeeLicenseFactory;
import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Express2LicenseService implements LicenseService {
    public Employee getLicense() {
        Express2Driver express2Driver = new Express2Driver();
        EmployeeLicenseFactory employeeLicenseFactory = new EmployeeLicenseFactory();

        express2Driver.setName("Jayson");
        express2Driver.setSurname("Jones");
        express2Driver.setLicense("P");

        return express2Driver;
    }
}
