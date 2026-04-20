import java.util.Queue;
import java.util.Scanner;

public class ColaMetodos {
    private int contadorTurnos = 1;
    public Queue<ObjCliente> LlegaCliente(Queue<ObjCliente> c, Scanner sc) {
        boolean seguir = true;
        Validaciones v = new Validaciones();
        while (seguir) {
            sc.nextLine();
            ObjCliente o = new ObjCliente();
            System.out.println("Digite nombre del cliente: ");
            o.setNombre(v.ValidarTexto(sc));
            System.out.println("Digite el tipo de servicio: ");
            o.setTipoServicio(v.ValidarTexto(sc));
            o.setId(contadorTurnos++);
            o.setHoraLlegada(java.time.LocalTime.now().toString());
            o.setAtendido(false);
            c.offer(o);
            System.out.println("El Cliente: "+ o.getNombre() +" fue agregado con turno #" + o.getId()+" exitosamente");
            System.out.println("¿Desea continuar? 1) SI 2) NO");
            int opt = v.ValidarEntero(sc);
            if (opt == 2) {
                seguir = false;
            }
        }
        return c;
    }

    public Queue<ObjCliente> AtenderCliente(Queue<ObjCliente> c, Queue<ObjCliente> a){
        if(c.isEmpty()){
            System.out.println("No hay clientes en espera.");
            return c;
        }
        ObjCliente o = c.poll();
        o.setAtendido(true);
        a.offer(o);
        System.out.println("Atendiendo a: " + o.getNombre() + " (Turno: #" + o.getId() + ")");
        return c;
    }

    public Queue<ObjCliente> VerCliente(Queue<ObjCliente> c) {
        if(c.isEmpty()){
            System.out.println("No hay clientes en espera.");
            return c;
        }
        ObjCliente o = c.peek();
        System.out.println("Siguiente cliente:");
        System.out.println("Turno: #" + o.getId());
        System.out.println("Nombre: " + o.getNombre());
        System.out.println("Servicio: " + o.getTipoServicio());
        System.out.println("----------------------------");
        return c;
    }

    public Queue<ObjCliente> VerCola(Queue<ObjCliente> c){
        if(c.isEmpty()){
            System.out.println("No hay clientes en espera");
        }
        System.out.println("Lista de clientes en espera:");
        for (ObjCliente o : c) {
            System.out.println("Turno: #"+o.getId());
            System.out.println("Nombre: "+o.getNombre());
            System.out.println("Servicio: "+o.getTipoServicio());
            System.out.println("Hora: "+o.getHoraLlegada());
            System.out.println("----------------------------");
        }
        return c;
    }

    public Queue<ObjCliente> MostrarTurno(Queue<ObjCliente> c, Queue<ObjCliente> a){
        System.out.println("\nTurnos atendidos: ");
        if(a.isEmpty()){
            System.out.println("No hay turnos");
        }else{
            for (ObjCliente o : a) {
                System.out.println("Turno : #"+o.getId()+" Cliente: "+o.getNombre());
            }
        }

        System.out.println("\nTurnos Pendientes: ");
        if(c.isEmpty()){
            System.out.println("Ninguno.");
        } else {
            for (ObjCliente o : c) {
                System.out.println("Turno #" + o.getId() + " - " + o.getNombre());
            }
        }
        return c;
    }
}
