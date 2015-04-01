import java.rmi.*;
import java.rmi.server.*;
public class Server
{
    public static void main (String args[])
    {
        try
        {
            SumadorVectorImpl misuma = new
            SumadorVectorImpl("rmi://localhost:1099"+"/MiSumador");
        }
        catch(Exception e)
        {
            System.err.println("System exception" + e);
        }
    }
}
