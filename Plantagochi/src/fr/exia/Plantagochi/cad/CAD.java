package fr.exia.Plantagochi.cad;

import fr.exia.Plantagochi.model.Serre;

public interface CAD extends Runnable{
	
	public float getHumiditeSol(int IDPlante);
	public float getHumiditeAir(int IDPlante);
	public float getTemperatureAir(int IDPlante);
	public float getLuminosite(int IDPlante);
	
	public void setModel(Serre serre);
	void run();
	
}
