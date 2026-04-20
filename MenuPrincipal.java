import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        PrincipalCola c = new PrincipalCola();
        PrincipalPila p = new PrincipalPila();
        while (seguir) {
            System.out.println("1. Ir al navegadro web");
            System.out.println("2. ir al sistema del banco");
            System.out.println("3. Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    c.iniciar();
                    break;
                case 2:
                    p.iniciar();
                    break;
                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("OPCION INVALIDA DIGITE DEL 1-3");
                    break;
            }
        }
    }
    
}
