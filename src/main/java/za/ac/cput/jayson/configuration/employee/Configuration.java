package za.ac.cput.jayson.configuration.employee;

import org.springframework.context.annotation.Bean;
import za.ac.cput.jayson.services.employee.Implementation.Express1LicenseService;
import za.ac.cput.jayson.services.employee.Implementation.Express2LicenseService;
import za.ac.cput.jayson.services.employee.Implementation.RegularLicenseService;
import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name = "reg")
    public LicenseService getRegular(){return new RegularLicenseService();};
    @Bean(name = "exp1")
    public LicenseService getExpress1(){return new Express1LicenseService();};
    @Bean(name = "exp2")
    public LicenseService getExpress2(){return new Express2LicenseService();};
}
