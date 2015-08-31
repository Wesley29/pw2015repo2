package br.senai.sc.ti2014n1.pw4.wes.bi.model.dominio.user;

public class User {
	
	private long idUsuario;
	private String titulo;
	private String descricao;
	
	public User(){
		
	}

	public User(long idUsuario, String titulo, String descricao) {
		super();
		this.idUsuario = idUsuario;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
