package it.televisore.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.televisore.dao.DB_Mock;
import it.televisore.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	private Connection connection;

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		Televisore result = new Televisore();
		for (Televisore item : DB_Mock.LISTA_TELEVISORI) {
			if (item.getId() == id)
				result = item;
		}
		return result;
	}

	@Override
	public int update(Televisore input) throws Exception {

		for (Televisore item : DB_Mock.LISTA_TELEVISORI) {
			if (item.getId() == input.getId()) {

				item.setMarca(input.getMarca());
				item.setModello(input.getModello());
				item.setPollici(input.getPollici());
				item.setSeriale(input.getSeriale());

				return 1;
			}
		}
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setId(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input) ? 1 : 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		return DB_Mock.LISTA_TELEVISORI.remove(input) ? 1 : 0;
	}

	@Override
	public List<Televisore> findByMarca(String marca) {
		
		List<Televisore> result = new ArrayList<>();

		for (Televisore item : DB_Mock.LISTA_TELEVISORI) {
			if (item.getMarca().startsWith(marca))
				result.add(item);
		}
		return result;
	}

}
