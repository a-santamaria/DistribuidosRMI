
import java.util.ArrayList;

public interface SumadorVector extends java.rmi.Remote
{
    public int sumarVector(ArrayList<Integer> array)
    throws java.rmi.RemoteException;
}
