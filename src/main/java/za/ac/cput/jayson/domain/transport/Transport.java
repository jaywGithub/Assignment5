package za.ac.cput.jayson.domain.transport;

/**
 * Created by JAYSON on 2016-04-03.
 */
public abstract class Transport {

    Transport transport;

    public void setNextMedium(Transport transport)
    {
        this.transport = transport;
    }

    public abstract String handleRequest(String request);
}
