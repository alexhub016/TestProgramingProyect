package NuevaCarpeta;

public class ClaseObjeto {
    private String nombre;
    private String tipo;
    private String descripción;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "ClaseObjeto{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripción='" + descripción + '\'' +
                '}';
    }
}
