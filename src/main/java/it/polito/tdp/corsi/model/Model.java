package it.polito.tdp.corsi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.daoCorso;

public class Model {

	private daoCorso dao;

	public Model() {
		dao = new daoCorso();
	}

	public List<Corso> getCorsByPeriodo(Integer pd) {

		return dao.getCorsiByPeriodo(pd);
	}

	public Map<Corso, Integer> getIscrittiByPeriodo(Integer pd) {

		return dao.getIscrittiByPeriodo(pd);
	}

	public List<Studente> getStudentiByCorso(Corso c) {
		return dao.getStudentiByCorso(c);
	}

	public boolean esisteCorso(String codins) {
		return dao.esisteCorso(codins);
	}

	public Map<String, Integer> getDivisioneCDS(Corso c) {

		//SOLUZIONE1
		/*List<Studente> studenti = dao.getStudentiByCorso(c);
		Map<String, Integer> statistiche = new HashMap<String, Integer>();

		for (Studente s : studenti) {
			if (s.getCDS() != null && !s.getCDS().equals("")) {
				if (statistiche.containsKey(s.getCDS())) {
					statistiche.put(s.getCDS(), statistiche.get(s.getCDS()) + 1);
				} else {
					statistiche.put(s.getCDS(), 1);
				}
			}
		}
		return statistiche;*/
		
		//SOLUZIONE 2
		return dao.getDivisioneCDS(c);
	}
}
