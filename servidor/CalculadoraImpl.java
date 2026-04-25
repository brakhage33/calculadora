import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    public float suma (float op1, float op2) {
        return op1 + op2;
    }

    public float resta (float op1, float op2) {
        return op1 - op2;
    }

    public float multiplicacion (float op1, float op2) {
        return op1 * op2;
    }

    public float division (float op1, float op2) throws DivisionPorCero {
        if (op2 == 0) {
            throw new DivisionPorCero("Error: division por cero");
	}
	return op1 / op2;
    }

}
