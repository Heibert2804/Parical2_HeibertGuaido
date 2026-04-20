import java.util.Scanner;
import java.util.Stack;

public class PilaMetodos {
    public Stack<objWeb> Llenarpila(Stack<objWeb> p, Scanner sc){
        boolean seguir = true;
        int opt = 0;
        Validaciones v = new Validaciones();
        while (seguir) {
            objWeb o = new objWeb();
            sc.nextLine();
            System.out.println("Ingrese el URL");
            o.setUrl(v.ValidarTexto(sc));
            System.out.println("Ingrese el nombre de la pagina");
            o.setTitulo(v.ValidarTexto(sc));
            System.out.println("Ingrese la fecha");
            o.setFecha(v.ValidarTexto(sc));

            p.push(o);
            System.out.println("Página visitada correctamente.");
            System.out.println("Desea continuar hacia otra pagina? 1)SI 2)NO");
            opt = sc.nextInt();
            if(opt == 2){
                seguir = false;
            }
        }

        return p;
    }

    public Stack<objWeb> mostrarpila(Stack<objWeb> p, Scanner sc){
        int opt = 0;
        PilaMetodos m = new PilaMetodos();
        if(p.isEmpty()){
            System.out.println("Historial Vacio, desa visitar un nueva pagina? \n 1) SI 2) NO");
            opt = sc.nextInt();
            if(opt==1){
                m.Llenarpila(p, sc);
            }else{
                return p;
            }
        }
        System.out.println("Historial de navegacion: \n");
        for (objWeb o : p) {
            System.out.println("URL: " + o.getUrl());
            System.out.println("Nombre de la pagina: " + o.getTitulo());
            System.out.println("Fecha de ingreso: " + o.getFecha());
            System.out.println("---------------------------------------------------");
        }
        
        return p;
    }

    public Stack<objWeb> retroceder(Stack<objWeb> p){
        if(p.size() > 1){
            p.pop();

            System.out.println("Regresaste a: ");
            objWeb actual = p.peek();

            System.out.println("URL: " + actual.getUrl());
            System.out.println("Título: " + actual.getTitulo());
        } else {
            System.out.println("No hay más páginas para retroceder.");
        }

        return p;
    }
    
}
