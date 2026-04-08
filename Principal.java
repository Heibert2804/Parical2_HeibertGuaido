import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Queue<ObjCliente> cola = new LinkedList<>();
        ObjCliente c = new ObjCliente();
        while (seguir) {
            System.out.println("1. Llegada De Un Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Ver Siguiente Cliente");
            System.out.println("4. Ver Cola Actual");
            System.out.println("5. Mostrar Trunos");
            System.out.println("6. Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.LlegaCliente(cola, sc);
                    break;
                case 2:
                    System.out.println("x");
                    break;
                case 3:
                    System.out.println("x");
                    break;
                case 4:
                    System.out.println("x");
                    break;
                case 5:
                    System.out.println("x");
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
