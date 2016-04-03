package za.ac.cput.jayson.domain.courierPackage;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class PackageType {

    private String type;

    public PackageType(){}

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public String determineType()
    {
        if(type.equalsIgnoreCase("sB"))
        {
            setType("smallBox");
        }
        else if(type.equalsIgnoreCase("mB"))
        {
            setType("mediumBox");
        }
        else if(type.equalsIgnoreCase("lB"))
        {
            setType("largeBox");
        }
        else if(type.equalsIgnoreCase("xE"))
        {
            setType("Extra Small Envelope");
        }

        else if(type.equalsIgnoreCase("sE"))
        {
            setType("Small Envelope");
        }

        else if(type.equalsIgnoreCase("mE"))
        {
            setType("Medium Envelope");
        }

        else if(type.equalsIgnoreCase("lE"))
        {
            setType("Large Envelope");
        }

        return getType();
    }
}
