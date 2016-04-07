package za.ac.cput.jayson.employee;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.jayson.domain.employee.RegularDriver;
import za.ac.cput.jayson.factories.employee.EmployeeLicenseFactory;
import za.ac.cput.jayson.services.employee.Implementation.Express1LicenseService;
import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestEmployee {
    @Test
    public void testRegular() throws Exception
    {
        RegularDriver regularDriver = new RegularDriver();
        regularDriver.setLicense("B");

        Assert.assertEquals(regularDriver.getLicense(), "B");
    }
}
