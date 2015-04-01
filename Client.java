import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.*;
import java.util.ArrayList;
public class Client
{
    public static void main(String args[])
    {
        int res = 0;
        try
        {
            System.out.println("Buscando Objeto ");
            SumadorVector misuma = (SumadorVector)Naming.lookup("rmi://" +
                                                    args[0] + "/" +"MiSumador");
            BufferedReader br = new BufferedReader((new FileReader(args[1])));
            ArrayList<Integer> arr = new ArrayList<>();
            String line;
            while(( line = br.readLine() ) != null ){
                String[] nums = line.split(" ");
                for(String s : nums){
                    arr.add(Integer.parseInt(s));
                }
            }
            res = misuma.sumarVector(arr);
            System.out.println("Suma del vector = " + res);
        }
        catch(Exception e)
        {
            System.err.println(" System exception");
        }
        System.exit(0);
    }
}
