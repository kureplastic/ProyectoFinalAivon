/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fran Gonzalez
 */
public class HistoricoCampaña {
   
    private int idHistoricoCampaña;
    private Campaña campaña;
    private Revendedor revendedor;
    private int estrellasRC;
    private boolean estadoRC;

    public HistoricoCampaña() {
    }

    public HistoricoCampaña(int idHistoricoCampaña, Campaña campaña, Revendedor revendedor, int estrellasRC, boolean estadoRC) {
        this.idHistoricoCampaña = idHistoricoCampaña;
        this.campaña = campaña;
        this.revendedor = revendedor;
        this.estrellasRC = estrellasRC;
        this.estadoRC = estadoRC;
    }

    public HistoricoCampaña(Campaña campaña, Revendedor revendedor, int estrellasRC, boolean estadoRC) {
        this.campaña = campaña;
        this.revendedor = revendedor;
        this.estrellasRC = estrellasRC;
        this.estadoRC = estadoRC;
    }

    public boolean isEstadoRC() {
        return estadoRC;
    }

    public void setEstadoRC(boolean estadoRC) {
        this.estadoRC = estadoRC;
    }
      
    

    public int getIdHistoricoCampaña() {
        return idHistoricoCampaña;
    }

    public Campaña getCampaña() {
        return campaña;
    }

    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }

    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }

    public int getEstrellasRC() {
        return estrellasRC;
    }

    public void setEstrellasRC(int estrellasRC) {
        this.estrellasRC = estrellasRC;
    }
    
    
    
    
    
}
