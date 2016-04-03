package za.ac.cput.jayson.factories.courierPackage;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class CourierPackageBuilder {

    private String packageDescription;
    private String packageReceiverName;
    private String packageReceiverContact;
    private CourierPackageBuilder(){}

    public String getPackageDescription()
    {
        return packageDescription;
    }

    public String getPackageReceiverName()
    {
        return packageReceiverName;
    }

    public String getPackageReceiverContact()
    {
        return packageReceiverContact;
    }

    public CourierPackageBuilder(Builder builder)
    {
        this.packageDescription = builder.packageDescription;
        this.packageReceiverName = builder.packageReceiverName;
        this.packageReceiverContact = builder.packageReceiverContact;
    }

    public static class Builder {
        private String packageDescription;
        private String packageReceiverName;
        private String packageReceiverContact;

        public Builder packageDescription(String value)
        {
            this.packageDescription = value;
            return this;
        }

        public Builder packageRecieverName(String value)
        {
            this.packageReceiverName = value;
            return this;
        }

        public Builder packageReceiverContact(String value)
        {
            this.packageReceiverContact = value;
            return this;
        }


        public Builder copy(CourierPackageBuilder value)
        {
            this.packageDescription = value.packageDescription;
            this.packageReceiverName = value.packageReceiverName;
            this.packageReceiverContact = value.packageReceiverContact;

            return this;
        }

        public CourierPackageBuilder build()
        {
            return new CourierPackageBuilder(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;

        CourierPackageBuilder courierPackage = (CourierPackageBuilder)o;

        return Boolean.parseBoolean(packageDescription = courierPackage.packageDescription);
    }

}
