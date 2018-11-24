package nl.test.Competitie.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klasse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long klasseId;
	
	private String label, labelshort;
	private double ondergrens, bovengrens;
	public long getKlasseId() {
		return klasseId;
	}
	public void setKlasseId(long klasseId) {
		this.klasseId = klasseId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabelshort() {
		return labelshort;
	}
	public void setLabelshort(String labelshort) {
		this.labelshort = labelshort;
	}
	public double getOndergrens() {
		return ondergrens;
	}
	public void setOndergrens(double ondergrens) {
		this.ondergrens = ondergrens;
	}
	public double getBovengrens() {
		return bovengrens;
	}
	public void setBovengrens(double bovengrens) {
		this.bovengrens = bovengrens;
	}
	
	
}
