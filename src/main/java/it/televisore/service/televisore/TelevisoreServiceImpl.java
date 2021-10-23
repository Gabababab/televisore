package it.televisore.service.televisore;

import java.util.List;

import it.televisore.dao.televisore.TelevisoreDAO;
import it.televisore.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService{

	private TelevisoreDAO televisoreDAO;
	
	@Override
	public void setTelevisoreDAO(TelevisoreDAO input){
		this.televisoreDAO=input;
	}
	
	@Override
	public List<Televisore> listAll() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public Televisore caricaSingolo(Long id) throws Exception {
		return televisoreDAO.get(id);
	}

	@Override
	public int modifica(Televisore input) throws Exception {
		return televisoreDAO.update(input);
	}

	@Override
	public int inserisciNuovo(Televisore input) throws Exception {
		return televisoreDAO.insert(input);
	}

	@Override
	public int rimuovi(Televisore input) throws Exception {
		return televisoreDAO.delete(input);
	}

	@Override
	public List<Televisore> findByMarca(String marca) throws Exception {
		return televisoreDAO.findByMarca(marca);
	}



}
