/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cdis
 */
@Entity
@Table(name = "VUELOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelos.findAll", query = "SELECT v FROM Vuelos v"),
    @NamedQuery(name = "Vuelos.findById", query = "SELECT v FROM Vuelos v WHERE v.id = :id"),
    @NamedQuery(name = "Vuelos.findByNumerodevuelos", query = "SELECT v FROM Vuelos v WHERE v.numerodevuelos = :numerodevuelos"),
    @NamedQuery(name = "Vuelos.findByNumerodeavion", query = "SELECT v FROM Vuelos v WHERE v.numerodeavion = :numerodeavion"),
    @NamedQuery(name = "Vuelos.findByOrigen", query = "SELECT v FROM Vuelos v WHERE v.origen = :origen"),
    @NamedQuery(name = "Vuelos.findByDestino", query = "SELECT v FROM Vuelos v WHERE v.destino = :destino"),
    @NamedQuery(name = "Vuelos.findByNumerodepasajeros", query = "SELECT v FROM Vuelos v WHERE v.numerodepasajeros = :numerodepasajeros"),
    @NamedQuery(name = "Vuelos.findByFechainiciovuelo", query = "SELECT v FROM Vuelos v WHERE v.fechainiciovuelo = :fechainiciovuelo"),
    @NamedQuery(name = "Vuelos.findByFechafindevuelo", query = "SELECT v FROM Vuelos v WHERE v.fechafindevuelo = :fechafindevuelo"),
    @NamedQuery(name = "Vuelos.findByHorainiciovuelo", query = "SELECT v FROM Vuelos v WHERE v.horainiciovuelo = :horainiciovuelo"),
    @NamedQuery(name = "Vuelos.findByHorafindevuelo", query = "SELECT v FROM Vuelos v WHERE v.horafindevuelo = :horafindevuelo")})
public class Vuelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "NUMERODEVUELOS")
    private String numerodevuelos;
    @Column(name = "NUMERODEAVION")
    private Boolean numerodeavion;
    @Column(name = "ORIGEN")
    private Boolean origen;
    @Size(max = 35)
    @Column(name = "DESTINO")
    private String destino;
    @Column(name = "NUMERODEPASAJEROS")
    private Integer numerodepasajeros;
    @Column(name = "FECHAINICIOVUELO")
    @Temporal(TemporalType.DATE)
    private Date fechainiciovuelo;
    @Column(name = "FECHAFINDEVUELO")
    @Temporal(TemporalType.DATE)
    private Date fechafindevuelo;
    @Column(name = "HORAINICIOVUELO")
    @Temporal(TemporalType.TIME)
    private Date horainiciovuelo;
    @Column(name = "HORAFINDEVUELO")
    @Temporal(TemporalType.TIME)
    private Date horafindevuelo;

    public Vuelos() {
    }

    public Vuelos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumerodevuelos() {
        return numerodevuelos;
    }

    public void setNumerodevuelos(String numerodevuelos) {
        this.numerodevuelos = numerodevuelos;
    }

    public Boolean getNumerodeavion() {
        return numerodeavion;
    }

    public void setNumerodeavion(Boolean numerodeavion) {
        this.numerodeavion = numerodeavion;
    }

    public Boolean getOrigen() {
        return origen;
    }

    public void setOrigen(Boolean origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNumerodepasajeros() {
        return numerodepasajeros;
    }

    public void setNumerodepasajeros(Integer numerodepasajeros) {
        this.numerodepasajeros = numerodepasajeros;
    }

    public Date getFechainiciovuelo() {
        return fechainiciovuelo;
    }

    public void setFechainiciovuelo(Date fechainiciovuelo) {
        this.fechainiciovuelo = fechainiciovuelo;
    }

    public Date getFechafindevuelo() {
        return fechafindevuelo;
    }

    public void setFechafindevuelo(Date fechafindevuelo) {
        this.fechafindevuelo = fechafindevuelo;
    }

    public Date getHorainiciovuelo() {
        return horainiciovuelo;
    }

    public void setHorainiciovuelo(Date horainiciovuelo) {
        this.horainiciovuelo = horainiciovuelo;
    }

    public Date getHorafindevuelo() {
        return horafindevuelo;
    }

    public void setHorafindevuelo(Date horafindevuelo) {
        this.horafindevuelo = horafindevuelo;
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
        if (!(object instanceof Vuelos)) {
            return false;
        }
        Vuelos other = (Vuelos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Vuelos[ id=" + id + " ]";
    }
    
}
