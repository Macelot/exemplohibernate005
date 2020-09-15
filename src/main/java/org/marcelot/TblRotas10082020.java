package org.marcelot;
// Generated 15/09/2020 18:55:45 by Hibernate Tools 5.4.18.Final

import java.util.Date;

/**
 * TblRotas10082020 generated by hbm2java
 */
public class TblRotas10082020 implements java.io.Serializable {

	private Integer id;
	private String tabela1;
	private String tabela1volta;
	private String mapa1;
	private String ro1;
	private String ra1;
	private String ro1volta;
	private String ra1volta;
	private String latlngOriginal;
	private String stopsCollection;
	private String legs;
	private String passageiros;
	private String nomeRota;
	private String nomeRotaVolta;
	private String usuario;
	private String proposta;
	private Date dc;
	private int ativo;
	private int pos;
	private String empresa;

	public TblRotas10082020() {
	}

	public TblRotas10082020(String tabela1, String ro1, String latlngOriginal, String stopsCollection, String legs,
			String passageiros, String nomeRota, String usuario, String proposta, Date dc, int ativo, int pos,
			String empresa) {
		this.tabela1 = tabela1;
		this.ro1 = ro1;
		this.latlngOriginal = latlngOriginal;
		this.stopsCollection = stopsCollection;
		this.legs = legs;
		this.passageiros = passageiros;
		this.nomeRota = nomeRota;
		this.usuario = usuario;
		this.proposta = proposta;
		this.dc = dc;
		this.ativo = ativo;
		this.pos = pos;
		this.empresa = empresa;
	}

	public TblRotas10082020(String tabela1, String tabela1volta, String mapa1, String ro1, String ra1, String ro1volta,
			String ra1volta, String latlngOriginal, String stopsCollection, String legs, String passageiros,
			String nomeRota, String nomeRotaVolta, String usuario, String proposta, Date dc, int ativo, int pos,
			String empresa) {
		this.tabela1 = tabela1;
		this.tabela1volta = tabela1volta;
		this.mapa1 = mapa1;
		this.ro1 = ro1;
		this.ra1 = ra1;
		this.ro1volta = ro1volta;
		this.ra1volta = ra1volta;
		this.latlngOriginal = latlngOriginal;
		this.stopsCollection = stopsCollection;
		this.legs = legs;
		this.passageiros = passageiros;
		this.nomeRota = nomeRota;
		this.nomeRotaVolta = nomeRotaVolta;
		this.usuario = usuario;
		this.proposta = proposta;
		this.dc = dc;
		this.ativo = ativo;
		this.pos = pos;
		this.empresa = empresa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTabela1() {
		return this.tabela1;
	}

	public void setTabela1(String tabela1) {
		this.tabela1 = tabela1;
	}

	public String getTabela1volta() {
		return this.tabela1volta;
	}

	public void setTabela1volta(String tabela1volta) {
		this.tabela1volta = tabela1volta;
	}

	public String getMapa1() {
		return this.mapa1;
	}

	public void setMapa1(String mapa1) {
		this.mapa1 = mapa1;
	}

	public String getRo1() {
		return this.ro1;
	}

	public void setRo1(String ro1) {
		this.ro1 = ro1;
	}

	public String getRa1() {
		return this.ra1;
	}

	public void setRa1(String ra1) {
		this.ra1 = ra1;
	}

	public String getRo1volta() {
		return this.ro1volta;
	}

	public void setRo1volta(String ro1volta) {
		this.ro1volta = ro1volta;
	}

	public String getRa1volta() {
		return this.ra1volta;
	}

	public void setRa1volta(String ra1volta) {
		this.ra1volta = ra1volta;
	}

	public String getLatlngOriginal() {
		return this.latlngOriginal;
	}

	public void setLatlngOriginal(String latlngOriginal) {
		this.latlngOriginal = latlngOriginal;
	}

	public String getStopsCollection() {
		return this.stopsCollection;
	}

	public void setStopsCollection(String stopsCollection) {
		this.stopsCollection = stopsCollection;
	}

	public String getLegs() {
		return this.legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getPassageiros() {
		return this.passageiros;
	}

	public void setPassageiros(String passageiros) {
		this.passageiros = passageiros;
	}

	public String getNomeRota() {
		return this.nomeRota;
	}

	public void setNomeRota(String nomeRota) {
		this.nomeRota = nomeRota;
	}

	public String getNomeRotaVolta() {
		return this.nomeRotaVolta;
	}

	public void setNomeRotaVolta(String nomeRotaVolta) {
		this.nomeRotaVolta = nomeRotaVolta;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getProposta() {
		return this.proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public Date getDc() {
		return this.dc;
	}

	public void setDc(Date dc) {
		this.dc = dc;
	}

	public int getAtivo() {
		return this.ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}