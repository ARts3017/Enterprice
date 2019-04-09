/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cdis
 */
@Entity
@Table(name = "EJEMPLO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejemplo.findAll", query = "SELECT e FROM Ejemplo e"),
    @NamedQuery(name = "Ejemplo.findById", query = "SELECT e FROM Ejemplo e WHERE e.id = :id"),
    @NamedQuery(name = "Ejemplo.findByEdad", query = "SELECT e FROM Ejemplo e WHERE e.edad = :edad"),
    @NamedQuery(name = "Ejemplo.findByNombre", query = "SELECT e FROM Ejemplo e WHERE e.nombre = :nombre")})
public class Ejemplo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "EDAD")
    private Integer edad;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;

    public Ejemplo() {
    }

    public Ejemplo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Ejemplo)) {
            return false;
        }
        Ejemplo other = (Ejemplo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Ejemplo[ id=" + id + " ]";
    }
    
}
