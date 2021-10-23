package it.televisore.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.televisore.model.Televisore;


public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "samsung", "HFG67", 60, "gh679j"));
		LISTA_TELEVISORI.add(new Televisore(2l, "samsung", "SJK", 20, "fkdnc"));
		LISTA_TELEVISORI.add(new Televisore(3l, "samsung", "4KPT", 30, "lopojgdr"));
		LISTA_TELEVISORI.add(new Televisore(4l, "hitachi", "VNO0", 55, "kdnvjf"));
		LISTA_TELEVISORI.add(new Televisore(5l, "lg", "LG67", 70, "kdvjdhs"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
	}

}
