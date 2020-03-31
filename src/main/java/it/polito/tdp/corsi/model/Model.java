package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.daoCorso;

public class Model {

	private daoCorso dao;
	
	public Model() {
		dao = new daoCorso();
	}
	public List<Corso> getCorsByPeriodo( Integer pd){
		
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo (Integer pd){
		
		return dao.getIscrittiByPeriodo(pd);
	}

}
