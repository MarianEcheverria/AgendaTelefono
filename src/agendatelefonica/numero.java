
package agendatelefonica;


public class numero {
   private int numerotel;
     private String nombre, correo;

    public numero(int numerotel, String nombre, String correo) {
        this.numerotel = numerotel;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     
}
