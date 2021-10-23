package it.televisore.model;

public class Televisore {

	private Long id;
	private String marca;
	private String modello;
	private int pollici;
	private String seriale;

	public Televisore() {
	};

	public Televisore(Long id, String marca, String modello, int pollici, String seriale) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.pollici = pollici;
		this.seriale = seriale;
	}

	public Televisore(String marca, String modello, int pollici, String seriale) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.pollici = pollici;
		this.seriale = seriale;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public String getSeriale() {
		return seriale;
	}

	public void setSeriale(String seriale) {
		this.seriale = seriale;
	}

}
