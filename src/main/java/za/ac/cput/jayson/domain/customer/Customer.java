package za.ac.cput.jayson.domain.customer;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Customer {

    private String name;
    private String surname;
    private String contactNumber;
    private String address;

    public Customer(){}

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

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setAddress(String area)
    {
        this.address = area;
    }

    public String getAddress()
    {
        return address;
    }
}
