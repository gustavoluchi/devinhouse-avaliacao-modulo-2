package br.com.devinhouse.model;

import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processo {
  
  @Id
  private Long nuProcesso;
	private String sgOrgaoProcesso;
	private String nuAnoProcesso;
	private String descricao;
  private Integer cdAssunto;
  private String descricaoAssunto;
  private Integer cdInteressado;
  private String nmInteressado;
	private String chaveProcesso; 

  public Long getNuProcesso() {
    return nuProcesso;
  }
  public void setNuProcesso(Long nuProcesso) {
    this.nuProcesso = nuProcesso;
  }
	public String getNmInteressado() {
    return nmInteressado;
  }
  public void setNmInteressado(String nmInteressado) {
    this.nmInteressado = nmInteressado;
  }
  public Integer getCdInteressado() {
    return cdInteressado;
  }
  public void setCdInteressado(Integer cdInteressado) {
    this.cdInteressado = cdInteressado;
  }
  public String getDescricaoAssunto() {
    return descricaoAssunto;
  }
  public void setDescricaoAssunto(String descricaoAssunto) {
    this.descricaoAssunto = descricaoAssunto;
  }
  public Integer getCdAssunto() {
    return cdAssunto;
  }
  public void setCdAssunto(Integer cdAssunto) {
    this.cdAssunto = cdAssunto;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public String getNuAnoProcesso() {
    return nuAnoProcesso;
  }
  public void setNuAnoProcesso(String nuAnoProcesso) {
    this.nuAnoProcesso = nuAnoProcesso;
  }
  public String getSgOrgaoProcesso() {
    return sgOrgaoProcesso;
  }
  public void setSgOrgaoProcesso(String sgOrgaoProcesso) {
    this.sgOrgaoProcesso = sgOrgaoProcesso;
  }
  public String getChaveProcesso() {
    return chaveProcesso;
  }
  public void setChaveProcesso() {
    this.chaveProcesso = sgOrgaoProcesso + " " + nuProcesso + "/" + nuAnoProcesso;
  }

}
