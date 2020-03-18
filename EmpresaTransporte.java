
public class EmpresaTransporte
{
    
    private Camion camion1;
    private Camion camion2;
    private Camion camion3;
    private Camion camion4;

    
  
    public EmpresaTransporte( )
    {
        camion1 = new Camion( camion1.getMatricula(),camion1.getCapacidad(), camion1.getConsumo() );
        camion2 = new Camion( camion2.getMatricula(),camion2.getCapacidad(), camion2.getConsumo() );
        camion3 = new Camion( camion3.getMatricula(),camion3.getCapacidad(), camion3.getConsumo() ); 
        camion1 = new Camion( camion4.getMatricula(),camion4.getCapacidad(), camion4.getConsumo() );
    }

    
    public Camion getCamion1( )
    {
        return camion1;
    }

    
    public Camion getCamion2( )
    {
        return camion2;
    }

   
    public Camion getCamion3( )
    {
        return camion3;
    }

    
    public Camion getCamion4( )
    {
        return camion4;
    }

    
    public boolean cargarCamion( String pMatricula, Integer pPesoCarga )
    {
        boolean cargo = false;
        if( camion1.getMatricula( ).equals( pMatricula ) )
        {
            cargo = camion1.cargar( pPesoCarga );
        }
        else if( camion2.getMatricula( ).equals( pMatricula ) )
        {
            cargo = camion2.cargar( pPesoCarga );
        }
        else if( camion3.getMatricula( ).equals( pMatricula ) )
        {
            cargo = camion3.cargar( pPesoCarga );
        }
        else if( camion4.getMatricula( ).equals( pMatricula ) )
        {
            cargo = camion4.cargar( pPesoCarga );
        }
        return cargo;
    }

    
    public void descargarCamion( String pMatricula )
    {
        if( camion1.getMatricula( ).equals( pMatricula ) )
        {
            camion1.descargar( );
        }
        else if( camion2.getMatricula( ).equals( pMatricula ) )
        {
            camion2.descargar( );
        }
        else if( camion3.getMatricula( ).equals( pMatricula ) )
        {
            camion3.descargar( );
        }
        else if( camion4.getMatricula( ).equals( pMatricula ) )
        {
            camion4.descargar( );
        }
    }

    
    public int getCapacidadTotal( )
    {
        return camion1.getCapacidad( ) + camion2.getCapacidad( ) + camion3.getCapacidad( ) + camion4.getCapacidad( );
    }

    
    public int getCargaTotal( )
    {
        return camion1.getCargaActual( ) + camion2.getCargaActual( ) + camion3.getCargaActual( ) + camion4.getCargaActual( );
    }

    
    public double calcularCargaPromedio( )
    {
        double promedio = ( double ) ( getCargaTotal( ) / 4 );
        return promedio;
    }

    
    public Camion getMejorCamion( Integer pPesoCarga )
    {
        Camion mejor = null;
        if( camion1.getCapacidad( ) >= pPesoCarga )
        {
            mejor = camion1;
        }
        if( camion2.getCapacidad( ) >= pPesoCarga && camion2.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion2;
        }
        if( camion3.getCapacidad( ) >= pPesoCarga && camion3.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion3;
        }
        if( camion4.getCapacidad( ) >= pPesoCarga && camion4.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion4;
        }
        return mejor;
    }

   
    
    public String metodo1( )
    {
        return "Respuesta 1.";
    }

   
    public String metodo2( )
    {
        return "Respuesta 2.";
    }

}


