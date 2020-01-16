package proyect_clases;

public class Boleto {
    
    private int     numero_boleto;
    private String  fecha_boleto;
    private String  hora_boleto;
    private int     costo_boleto;
    private String  cedula;
    private String  idRuta;
    
    public Boleto(){
    
    }

    public Boleto(int numero_boleto, String fecha_boleto, String hora_boleto, int costo_boleto, String cedula, String idRuta) {
        this.numero_boleto = numero_boleto;
        this.fecha_boleto = fecha_boleto;
        this.hora_boleto = hora_boleto;
        this.costo_boleto = costo_boleto;
        this.cedula = cedula;
        this.idRuta = idRuta;
    }

    public int getNumero_boleto() {
        return numero_boleto;
    }

    public void setNumero_boleto(int numero_boleto) {
        this.numero_boleto = numero_boleto;
    }

    public String getFecha_boleto() {
        return fecha_boleto;
    }

    public void setFecha_boleto(String fecha_boleto) {
        this.fecha_boleto = fecha_boleto;
    }

    public String getHora_boleto() {
        return hora_boleto;
    }

    public void setHora_boleto(String hora_boleto) {
        this.hora_boleto = hora_boleto;
    }

    public int getCosto_boleto() {
        return costo_boleto;
    }

    public void setCosto_boleto(int costo_boleto) {
        this.costo_boleto = costo_boleto;
    }
    
      public String getCedula() {
        return cedula;
    }
      
      public void setCedula(String cedula) {
        this.cedula = cedula;
    }
       public String getIdRuta() {
        return idRuta;
    }
      
      public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

   
    
    
}
