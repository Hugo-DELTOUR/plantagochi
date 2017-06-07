package fr.exia.Plantagochi.model;

import java.util.Observable;

public class Plante extends Observable{
	
	private int IDPlante;
	
	private float TemperatureAir;
	private float HumiditeAir;
	private float humiditeSol;
	private float tauxLuminosite;
	
	private Espece espece;
	
	public Plante(int iDPlante, float temperatureAir, float humiditeAir, float humiditeSol, float tauxLuminosite, Espece espece) {
		super();
		this.IDPlante = iDPlante;
		this.TemperatureAir = temperatureAir;
		this.HumiditeAir = humiditeAir;
		this.humiditeSol = humiditeSol;
		this.tauxLuminosite = tauxLuminosite;
		this.espece = espece;
	}
	
	public Plante (int IDPlante, Espece espece){
		
		this(IDPlante,0,0,0,0,espece);
		
	}
	
	public float getTemperatureAir() {
		return TemperatureAir;
	}

	public void setTemperatureAir(float temperatureAir) {
		this.TemperatureAir = temperatureAir;
	}

	public float getHumiditeAir() {
		return HumiditeAir;
	}

	public void setHumiditeAir(float humiditeAir) {
		this.HumiditeAir = humiditeAir;
	}

	public float getHumiditeSol() {
		return humiditeSol;
	}

	public void setHumiditeSol(float humiditeSol) {
		this.humiditeSol = humiditeSol;
	}

	public float getTauxLuminosite() {
		return tauxLuminosite;
	}

	public void setTauxLuminosite(float tauxLuminosite) {
		this.tauxLuminosite = tauxLuminosite;
	}

	public int getIDPlante() {
		return IDPlante;
	}

	public Espece getEspece() {
		return espece;
	}

	public void hasBeenChanged() {
		setChanged();		
	}
	
}
