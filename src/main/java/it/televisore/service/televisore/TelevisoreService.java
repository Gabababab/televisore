package it.televisore.service.televisore;

import java.util.List;

import it.televisore.dao.televisore.TelevisoreDAO;
import it.televisore.model.Televisore;

public interface TelevisoreService {

	public List<Televisore> listAll() throws Exception;
	
	public List<Televisore> findByMarca(String marca) throws Exception;

	public Televisore caricaSingolo(Long id) throws Exception;
	
	public int modifica(Televisore input) throws Exception; 
	
	public int inserisciNuovo(Televisore input) throws Exception;
	
	public int rimuovi(Televisore input) throws Exception;
	
	public void setTelevisoreDAO(TelevisoreDAO input);
}
