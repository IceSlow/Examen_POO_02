package clases;

public class clsListaUsuarios {
    final int MAX = 10;
    int contador = 0;
    clsUsuario datosU[];

    public clsListaUsuarios() {
        datosU = new clsUsuario[MAX];
    }

    public boolean espacioLleno() {
        return MAX > contador;
    }

    public void registrar(clsUsuario usuario) {
        datosU[contador] = usuario;
        contador++;
    }

    public boolean buscarCodigo(String codigoBuscar) {
        boolean bandera = false;
        for (int i = 0; i < contador; i++) {
            if (datosU[i].codUsuario.equals(codigoBuscar)) {
                bandera = true;
            }
        }
        return bandera;
    }

    public String mostrarLista() {
        String almacenarString = "";
        for (int i = 0; i < contador; i++) {
            almacenarString += datosU[i].mostrarUsuario() + "\n";
        }
        return almacenarString;
    }
}
