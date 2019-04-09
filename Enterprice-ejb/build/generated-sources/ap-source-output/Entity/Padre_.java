package Entity;

import Entity.Hijo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-09T13:10:49")
@StaticMetamodel(Padre.class)
public class Padre_ { 

    public static volatile SingularAttribute<Padre, Integer> id;
    public static volatile SingularAttribute<Padre, String> nombre;
    public static volatile SingularAttribute<Padre, Integer> edad;
    public static volatile ListAttribute<Padre, Hijo> hijoList;

}