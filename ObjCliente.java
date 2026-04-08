public class ObjCliente {
    private int Id;
    private String Nombre;
    private String TipoServicio;
    private int HoraLlegada;
    private boolean Atendido;
    
    public ObjCliente() {
    }

    public ObjCliente(int id, String nombre, String tipoServicio, int horaLlegada, boolean atendido) {
        Id = id;
        Nombre = nombre;
        TipoServicio = tipoServicio;
        HoraLlegada = horaLlegada;
        Atendido = atendido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        TipoServicio = tipoServicio;
    }

    public int getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        HoraLlegada = horaLlegada;
    }

    public boolean isAtendido() {
        return Atendido;
    }

    public void setAtendido(boolean atendido) {
        Atendido = atendido;
    }

}