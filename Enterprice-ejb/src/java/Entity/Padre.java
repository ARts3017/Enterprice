/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cdis
 */
@Entity
@Table(name = "PADRE",schema="CDIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Padre.findAll", query = "SELECT p FROM Padre p"),
    @NamedQuery(name = "Padre.findById", query = "SELECT p FROM Padre p WHERE p.id = :id"),
    @NamedQuery(name = "Padre.findByNombre", query = "SELECT p FROM Padre p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Padre.findByEdad", query = "SELECT p FROM Padre p WHERE p.edad = :edad")})
public class Padre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "EDAD")
    private Integer edad;
    
    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "Padre")
    private List<Hijo> hijoList;
    
    

    public Padre() {
    }

    public Padre(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Padre)) {
            return false;
        }
        Padre other = (Padre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Padre[ id=" + id + " ]";
    }
    
}
