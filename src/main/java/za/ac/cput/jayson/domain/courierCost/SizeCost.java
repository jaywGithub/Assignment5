package za.ac.cput.jayson.domain.courierCost;

import za.ac.cput.jayson.domain.courierPackage.PackageSize;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class SizeCost {

    private double cost;
    private String size;

    PackageSize packageSize = new PackageSize();

    public double calculateSizeCost()
    {
        if(packageSize.determineSize().equalsIgnoreCase("smallBox"))
        {
            cost = 20;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("mediumBox"))
        {
            cost = 30;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("largeBox"))
        {
            cost = 50;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("extraSmallEnvelope"))
        {
            cost = 5;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("smallEnvelope"))
        {
            cost = 7;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("mediumEnvelope"))
        {
            cost = 10;
        }

        else if(packageSize.determineSize().equalsIgnoreCase("largeEnvelope"))
        {
            cost = 15;
        }

        return cost;
    }
}
