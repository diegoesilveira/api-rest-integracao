package br.com.integratorapi.domain;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Itinerario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod;

	@JsonProperty("idlinha")
	private String idLinha;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("codigo")
	private String codigo;

	@JsonIgnoreProperties
	@ElementCollection
	@CollectionTable(name="itineratio_rota", joinColumns = @JoinColumn(name="itinerario_id"))
	@MapKeyColumn(name="rota")
	private Map<String, Rota> rotas;

	public Itinerario() {
	}

	public Itinerario(Long cod, String idLinha, String nome, String codigo) {
		this.cod = cod;
		this.idLinha = idLinha;
		this.nome = nome;
		this.codigo = codigo;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getIdLinha() {
		return idLinha;
	}

	public void setIdLinha(String idLinha) {
		this.idLinha = idLinha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Map<String, Rota> getRotas() {
		return rotas;
	}

	public void setRotas(Map<String, Rota> rotas) {
		this.rotas = rotas;
	}

	@Override
	public String toString() {
		return "Itinerario [idLinha=" + idLinha + ", nome=" + nome + ", codigo=" + codigo + ", rotas=" + rotas + "]";
	}

}
