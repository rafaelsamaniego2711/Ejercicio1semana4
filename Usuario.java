
public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;

    // Constructor requerido
    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getCorreo() {
        return this.correo;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
