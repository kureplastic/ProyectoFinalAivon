
package entidades;

public class Revendedor {
   private int idRevendedor;
   private long dni;
   private String nombreRevendedor;
   private long telefono;
   private String mail;
   private boolean activo;
   private boolean estuvoEnCampaña;

    public Revendedor(int idRevendedor, long dni, String nombreRevendedor, long telefono, String mail, boolean activo, boolean estuvoEnCampaña) {
        this.idRevendedor = idRevendedor;
        this.dni = dni;
        this.nombreRevendedor = nombreRevendedor;
        this.telefono = telefono;
        this.mail = mail;
        this.activo = activo;
        this.estuvoEnCampaña = estuvoEnCampaña;
    }

    public Revendedor(long dni, String nombreRevendedor, long telefono, String mail, boolean activo, boolean estuvoEnCampaña) {
        this.dni = dni;
        this.nombreRevendedor = nombreRevendedor;
        this.telefono = telefono;
        this.mail = mail;
        this.activo = activo;
        this.estuvoEnCampaña = estuvoEnCampaña;
    }

    public Revendedor() {
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

    public boolean isEstuvoEnCampaña() {
        return estuvoEnCampaña;
    }

    public void setEstuvoEnCampaña(boolean estuvoEnCampaña) {
        this.estuvoEnCampaña = estuvoEnCampaña;
    }

   
}
