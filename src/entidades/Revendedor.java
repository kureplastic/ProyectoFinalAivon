
package entidades;

public class Revendedor {
  private int idRevendedor;
   private long dni;
   private String nombreRevendedor;
   private String apellidoRevendedor;
   private long telefono;
   private String mail;
   private boolean activo;
   private int nivel;

    public Revendedor(int idRevendedor, long dni, String nombreRevendedor, String apellidoRevendedor, long telefono, String mail, boolean activo, int nivel) {
        this.idRevendedor = idRevendedor;
        this.dni = dni;
        this.nombreRevendedor = nombreRevendedor;
        this.apellidoRevendedor = apellidoRevendedor;
        this.telefono = telefono;
        this.mail = mail;
        this.activo = activo;
        this.nivel = nivel;
    }

    public Revendedor(long dni, String nombreRevendedor, String apellidoRevendedor, long telefono, String mail, boolean activo, int nivel) {
        this.dni = dni;
        this.nombreRevendedor = nombreRevendedor;
        this.apellidoRevendedor = apellidoRevendedor;
        this.telefono = telefono;
        this.mail = mail;
        this.activo = activo;
        this.nivel = nivel;
    }

    

   

    public Revendedor() {
    }

    public String getApellidoRevendedor() {
        return apellidoRevendedor;
    }

    public void setApellidoRevendedor(String apellidoRevendedor) {
        this.apellidoRevendedor = apellidoRevendedor;
    }
    
    public void subirNivel(){
        nivel++;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getIdRevendedor() {
        return idRevendedor;
    }

    public void setIdRevendedor(int idRevendedor) {
        this.idRevendedor = idRevendedor;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombreRevendedor() {
        return nombreRevendedor;
    }

    public void setNombreRevendedor(String nombreRevendedor) {
        this.nombreRevendedor = nombreRevendedor;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    


   
}
