package za.ac.cput.jayson.factories.employee;

import za.ac.cput.jayson.domain.employee.Employee;
import za.ac.cput.jayson.domain.employee.Express1Driver;
import za.ac.cput.jayson.domain.employee.Express2Driver;
import za.ac.cput.jayson.domain.employee.RegularDriver;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class EmployeeLicenseFactory {

    private String licenseType;
    Employee employee;

    public EmployeeLicenseFactory(){}

    public Employee makeLicense(String licenseType)
    {
        if(licenseType.equalsIgnoreCase("B"))
        {
            return new RegularDriver();
        }

        else if(licenseType.equalsIgnoreCase("C"))
        {
            return new Express1Driver();
        }

        else if(licenseType.equalsIgnoreCase("P"))
        {
            return new Express2Driver();
        }

        else
        {
             return null;
        }
    }
}
