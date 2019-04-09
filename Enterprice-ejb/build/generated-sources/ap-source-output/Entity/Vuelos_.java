package Entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-09T13:10:49")
@StaticMetamodel(Vuelos.class)
public class Vuelos_ { 

    public static volatile SingularAttribute<Vuelos, Integer> numerodepasajeros;
    public static volatile SingularAttribute<Vuelos, Date> horafindevuelo;
    public static volatile SingularAttribute<Vuelos, String> numerodevuelos;
    public static volatile SingularAttribute<Vuelos, Date> fechafindevuelo;
    public static volatile SingularAttribute<Vuelos, Date> fechainiciovuelo;
    public static volatile SingularAttribute<Vuelos, Integer> id;
    public static volatile SingularAttribute<Vuelos, Boolean> origen;
    public static volatile SingularAttribute<Vuelos, String> destino;
    public static volatile SingularAttribute<Vuelos, Date> horainiciovuelo;
    public static volatile SingularAttribute<Vuelos, Boolean> numerodeavion;

}