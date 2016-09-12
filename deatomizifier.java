import java.lang.*;
import java.io.*;

public class TheDeatomizifierV2 {


 public static void main(String[] args) throws IOException
 {
  double mass;
  double joules;

  System.out.println("Input the mass of your object (in kg)");

  InputStreamReader r = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(r);

  mass = Double.parseDouble(br.readLine());

  joules = mass * Math.pow((2.998 * Math.pow(10,8)), 2);

  System.out.println("The amount of energy your mass would deatomize to is " + joules);
 }

}
