package za.ac.cput.jayson.domain.employee;

import za.ac.cput.jayson.services.employee.LicenseService;

/**
 * Created by JAYSON on 2016-04-03.
 */
public abstract class Employee {

    private String name;
    private String surname;
    private String license;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setLicense(String license)
    {
        this.license = license;
    }

    public String getLicense()
    {
        return license;
    }
}
