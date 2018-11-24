package nl.test.Competitie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Speler {
	
	@Id
	@GeneratedValue
	private long spelerId;
	
	private String voornaam, tussenvoegsel, achternaam;
	private long klasseId;
	public long getSpelerId() {
		return spelerId;
	}
	public void setSpelerId(long spelerId) {
		this.spelerId = spelerId;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public long getKlasseId() {
		return klasseId;
	}
	public void setKlasseId(long klasseId) {
		this.klasseId = klasseId;
	}
	
}
