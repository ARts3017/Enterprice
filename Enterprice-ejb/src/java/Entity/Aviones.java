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
@Table(name = "AVIONES", schema="CDIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aviones.findAll", query = "SELECT a FROM Aviones a"),
    @NamedQuery(name = "Aviones.findById", query = "SELECT a FROM Aviones a WHERE a.id = :id"),
    @NamedQuery(name = "Aviones.findByNumerodeavion", query = "SELECT a FROM Aviones a WHERE a.numerodeavion = :numerodeavion"),
    @NamedQuery(name = "Aviones.findByCapacidaddepasajeros", query = "SELECT a FROM Aviones a WHERE a.capacidaddepasajeros = :capacidaddepasajeros"),
    @NamedQuery(name = "Aviones.findByModelo", query = "SELECT a FROM Aviones a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Aviones.findByAerolinea", query = "SELECT a FROM Aviones a WHERE a.aerolinea = :aerolinea")})
public class Aviones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "NUMERODEAVION")
    private String numerodeavion;
    @Column(name = "CAPACIDADDEPASAJEROS")
    private Integer capacidaddepasajeros;
    @Size(max = 25)
    @Column(name = "MODELO")
    private String modelo;
    @Size(max = 35)
    @Column(name = "AEROLINEA")
    private String aerolinea;

    public Aviones() {
    }

    public Aviones(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumerodeavion() {
        return numerodeavion;
    }

    public void setNumerodeavion(String numerodeavion) {
        this.numerodeavion = numerodeavion;
    }

    public Integer getCapacidaddepasajeros() {
        return capacidaddepasajeros;
    }

    public void setCapacidaddepasajeros(Integer capacidaddepasajeros) {
        this.capacidaddepasajeros = capacidaddepasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
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
        if (!(object instanceof Aviones)) {
            return false;
        }
        Aviones other = (Aviones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Aviones[ id=" + id + " ]";
    }
    
}
