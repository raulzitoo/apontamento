package br.com.apontamento.models;

import java.util.Calendar;

public class Apontamento {
	
	
	private Calendar data;
	private String hora;
	private String descricao;
	
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Apontamento [data=" + data + ", hora=" + hora + ", descricao=" + descricao + "]";
	}

	
}
