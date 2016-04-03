package za.ac.cput.jayson.domain.courierPackage;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class PackageSize {

    private String smallBox;
    private String mediumBox;
    private String largeBox;

    private String extraSmall;
    private String small;
    private String medium;
    private String large;

    private String type;
    private String size;

    PackageType pType = new PackageType();

    public void setSmallBox(String smallBox)
    {
        this.smallBox = smallBox;
    }

    public String getSmallBox()
    {
        return smallBox;
    }

    public void setMediumBox(String mediumBox)
    {
        this.mediumBox = mediumBox;
    }

    public String getMediumBox()
    {
        return mediumBox;
    }

    public void setLargeBox(String largeBox)
    {
        this.largeBox = largeBox;
    }

    public String getLargeBox()
    {
        return largeBox;
    }

    public void setExtraSmall(String extraSmall)
    {
        this.extraSmall = extraSmall;
    }

    public String getExtraSmall()
    {
        return "extraSmallEnvelope";
    }

    public void setSmall(String small)
    {
        this.small = small;
    }

    public String getSmall()
    {
        return "smallEnvelope";
    }

    public void setMedium(String medium)
    {
        this.medium = medium;
    }

    public String getMedium()
    {
        return "mediumEnvelope";
    }

    public void setLarge(String large)
    {
        this.large = large;
    }

    public String getLarge()
    {
        return "largeEnvelope";
    }

    public String determineSize()
    {
        if(pType.determineType().equalsIgnoreCase("sBox"))
        {
            size = getSmallBox();
        }

        else if(pType.determineType().equalsIgnoreCase("mBox"))
        {
            size = getMediumBox();
        }

        else if(pType.determineType().equalsIgnoreCase("lBox"))
        {
            size = getLargeBox();
        }

        else if(pType.determineType().equalsIgnoreCase("xsEnvelope"))
        {
            size = getExtraSmall();
        }

        else if(pType.determineType().equalsIgnoreCase("sEnvelope"))
        {
            size = getSmall();
        }

        else if(pType.determineType().equalsIgnoreCase("mEnvelope"))
        {
            size = getMedium();
        }

        else if(pType.determineType().equalsIgnoreCase("lEnvelope"))
        {
            size = getLarge();
        }

        return size;
    }
}
