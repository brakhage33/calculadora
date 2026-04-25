import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    float suma (float o1, float o2) throws RemoteException;
    float resta (float o1, float o2) throws RemoteException;
    float multiplicacion (float o1, float o2) throws RemoteException;
    float division (float o1, float o2) throws RemoteException, DivisionPorCero;
}
