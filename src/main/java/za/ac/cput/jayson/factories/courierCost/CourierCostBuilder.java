package za.ac.cput.jayson.factories.courierCost;

import za.ac.cput.jayson.domain.courierCost.DistanceCost;
import za.ac.cput.jayson.domain.courierCost.SizeCost;
import za.ac.cput.jayson.domain.courierCost.TransportCost;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class CourierCostBuilder {

    private double totalCost;

    public double getTotalCost()
    {
        return totalCost;
    }

    public CourierCostBuilder(Builder builder)
    {
        this.totalCost = builder.totalCost;
    }

    public static class Builder
    {
        private double totalCost;
        //public double value;

        DistanceCost distanceCost = new DistanceCost();
        SizeCost sizeCost = new SizeCost();
        TransportCost transportCost = new TransportCost();

        public Builder totalCost(double distance, double size, double transport)
        {
            this.totalCost = distance + size + transport;
            return this;
        }

        public Builder copy(CourierCostBuilder value)
        {
            this.totalCost = value.totalCost;

            return this;
        }

        public CourierCostBuilder build()
        {
            return new CourierCostBuilder(this);
        }
    }
}
