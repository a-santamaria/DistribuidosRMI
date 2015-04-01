import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
public class SumadorVectorImpl extends UnicastRemoteObject
    implements SumadorVector
{
    public SumadorVectorImpl(String name) throws RemoteException
    {
        super();
        try {
            System.out.println("Rebind Object " + name);
            Naming.rebind(name, this);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public int sumarVector(ArrayList<Integer> array)
    {
        int sum = 0;
        for(Integer i : array){
            sum += i;
        }
        return sum;
    }
}
