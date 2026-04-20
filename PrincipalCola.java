import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincipalCola {
    public void iniciar() {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        ColaMetodos m = new ColaMetodos();
        Queue<ObjCliente> cola = new LinkedList<>();
        Queue<ObjCliente> atendidos = new LinkedList<>();
        while (seguir) {
            System.out.println("1. Llegada De Un Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Ver Siguiente Cliente");
            System.out.println("4. Ver cola");
            System.out.println("5. Mostrar Trunos");
            System.out.println("6. Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    cola = m.LlegaCliente(cola, sc);
                    break;
                case 2:
                    cola = m.AtenderCliente(cola, atendidos);
                    break;
                case 3:
                    cola = m.VerCliente(cola);
                    break;
                case 4:
                    cola = m.VerCola(cola);
                    break;
                case 5:
                    cola = m.MostrarTurno(cola, atendidos);
                    break;
                case 6:
                    seguir = false;
                break;
                default:
                    System.out.println("OPCION INVALIDA DIGITE DEL 1-6");
                    break;
            }
        }
    }
    
}
