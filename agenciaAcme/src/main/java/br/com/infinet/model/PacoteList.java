package br.com.infinet.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PacoteList {
	
	public PacoteList() {
		this.pacotes = new ArrayList<Pacote>();
	}

	private List<Pacote> pacotes;
	
}
