import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Queue<ObjCliente> LlegaCliente(Queue<ObjCliente> c, Scanner sc) {
        boolean pregutar = true;
        Validaciones v = new Validaciones();
        while (pregutar) {
            ObjCliente o = new ObjCliente();
            System.out.println("Digite el numero");
            int numero = v.ValidarEntero(sc);
            String texto = v.ValidarTexto(sc);
            o.setId(numero);
            c.offer(o);
            o.setNombre(texto);
            c.offer(o);
            o.setTipoServicio(texto);
            c.offer(o);
            o.setHoraLlegada(numero);
            c.offer(o);
            o.setAtendido(false);
            c.offer(o);
            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                pregutar = false;
            }
        }
        return c;
    }

    public Queue<ObjCliente> AtenderCliente(Queue<ObjCliente> p){

        return p;
    }

    public Queue<ObjCliente> VerCliente(Queue<ObjCliente> p){

        return p;
    }

    public Queue<ObjCliente> VerCola(Queue<ObjCliente> p){

        return p;
    }

    public Queue<ObjCliente> MostrarTurno(Queue<ObjCliente> p){

        return p;
    }
}
