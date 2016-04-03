package za.ac.cput.jayson.domain.destination;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Destination {

    private String branchName;
    private String areaName;
    private String areaCode;

    public Destination(){}

    public void setBranchName(String branchName)
    {
        this.branchName = branchName;
    }

    public String getBranchName()
    {
        return branchName;
    }

    public void setAreaName(String areaName)
    {
        this.areaName = areaName;
    }

    public String getAreaName()
    {
        return areaName;
    }

    public void setAreaCode(String areaCode)
    {
        this.areaCode = areaCode;
    }

    public String getAreaCode()
    {
        return areaCode;
    }
}
