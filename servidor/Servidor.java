import java.rmi.Naming;

public class Servidor {

 public static void main(String[] args) {
   try{
      // Crear el objeto que implementa los servicios
      String ipRegistro = "registro-rmi.duckdns.org";
      String URL = "rmi://" + ipRegistro + ":1099/CalculadoraServer";
      CalculadoraImpl obj=new CalculadoraImpl();
      // Registrarlo
      Naming.rebind(URL,obj);
      System.out.println("CalculadoraServer registrada");
   }
   catch (Exception e)
   {
      System.out.println("Error en CalculadoraImpl:"+e.getMessage());
      e.printStackTrace();
   }
 }
}
