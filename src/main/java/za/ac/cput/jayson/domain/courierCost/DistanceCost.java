package za.ac.cput.jayson.domain.courierCost;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class DistanceCost {

    private double distance;
    private double cost;

    public DistanceCost(){}

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public double getDistance()
    {
        return distance;
    }

    public double calculateDistanceCost(double distance)
    {
        if(distance <= 100)
        {
            cost = 50;
        }
        else if(distance <= 150)
        {
            cost = 75;
        }
        else if(distance <= 250)
        {
            cost = 150;
        }
        else if(distance <= 500)
        {
            cost = 275;
        }
        else if(distance <= 1000)
        {
            cost = 400;
        }
        else
        {
            cost = 600;
        }

        return cost;
    }
}
