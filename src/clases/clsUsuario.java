package clases;

public class clsUsuario {
    String nomUsuario;
    String codUsuario;
    int edad;

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarUsuario() {
        return nomUsuario + " - " + codUsuario + " - " + edad;
    }
}
