package za.ac.cput.jayson.domain.courierCost;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TransportCost {

    private String transportType;
    private double cost;

    public void setTransportType(String transportType)
    {
        this.transportType = transportType;
    }

    public String getTransportType()
    {
        return transportType;
    }

    public double calculateTransportCost(String transportType)
    {
        if(transportType.equalsIgnoreCase("Regular"))
        {
            cost = 50;
        }

        else if(transportType.equalsIgnoreCase("Express1"))
        {
            cost = 100;
        }

        else if(transportType.equalsIgnoreCase("Express2"))
        {
            cost = 50;
        }

        return cost;
    }
}
