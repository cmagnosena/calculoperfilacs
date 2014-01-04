package br.com.unirio.perfilacs.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Representa uma condição ou doença de uma pessoa
 * 
 * @author Carlos
 * 
 */
@Entity
public class Condicao implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -1580203396007902053L;

    @Id
    int idCondicao;

    @Column(name = "OBSERVACAO")
    String observacao;

    public Condicao()
    {
	super();
    }

    public Condicao(int idCondicao, String observacao)
    {
	super();
	this.idCondicao = idCondicao;
	this.observacao = observacao;
    }

    public int getIdCondicao()
    {
	return idCondicao;
    }

    public String getObservacao()
    {
	return observacao;
    }

    public void setIdCondicao(int idCondicao)
    {
	this.idCondicao = idCondicao;
    }

    public void setObservacao(String observacao)
    {
	this.observacao = observacao;
    }

}
