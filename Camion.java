public class Camion
{

    
    
    private String matricula;
    private Integer capacidad;
    private double consumo;
    private Integer cargaActual;

    
    
    public Camion( String pMatricula, Integer pCapacidad, double pConsumo )
    {
        matricula = pMatricula;
        capacidad = pCapacidad;
        consumo = pConsumo;
        cargaActual = 0;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Integer getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(Integer cargaActual) {
        this.cargaActual = cargaActual;
    }


   
    public boolean cargar( Integer pPesoCarga )
    {
        boolean cargo = false;
        if( pPesoCarga <= capacidad )
        {
            cargo = true;
            cargaActual = pPesoCarga;
        }
        return cargo;
    }

    
    public void descargar( )
    {
        cargaActual = 0;
    }

}
