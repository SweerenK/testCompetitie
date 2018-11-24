package nl.test.Competitie.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Score {

	@Id
	@GeneratedValue
	private long scoreId;
	
	private long spelerId;
	private int waarde;
	private LocalDate datum;
	private boolean starter;
	public long getScoreId() {
		return scoreId;
	}
	public void setScoreId(long scoreId) {
		this.scoreId = scoreId;
	}
	public long getSpelerId() {
		return spelerId;
	}
	public void setSpelerId(long spelerId) {
		this.spelerId = spelerId;
	}
	public int getWaarde() {
		return waarde;
	}
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public boolean isStarter() {
		return starter;
	}
	public void setStarter(boolean starter) {
		this.starter = starter;
	}
}
