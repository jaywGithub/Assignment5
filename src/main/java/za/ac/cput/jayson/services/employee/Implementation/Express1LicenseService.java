package za.ac.cput.jayson.services.employee.Implementation;

import za.ac.cput.jayson.domain.employee.Employee;
import za.ac.cput.jayson.domain.employee.Express1Driver;
import za.ac.cput.jayson.factories.employee.EmployeeLicenseFactory;
import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Express1LicenseService implements LicenseService {
    public Employee getLicense() {
        Express1Driver express1Driver = new Express1Driver();
        EmployeeLicenseFactory employeeLicenseFactory = new EmployeeLicenseFactory();

        express1Driver.setName("John");
        express1Driver.setSurname("Williams");
        express1Driver.setLicense("C");

        return express1Driver;
    }
}
