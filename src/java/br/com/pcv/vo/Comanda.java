package br.com.pcv.vo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Comanda implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Usuario usuario;
    @Temporal(TemporalType.DATE)
    private Date dataDoPedido;
    @Temporal (TemporalType.TIME)
    private Time horarioDoPedido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(Date dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public Time getHorarioDoPedido() {
        return horarioDoPedido;
    }

    public void setHorarioDoPedido(Time horarioDoPedido) {
        this.horarioDoPedido = horarioDoPedido;
    }
    
}