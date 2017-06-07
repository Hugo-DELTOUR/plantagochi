package fr.exia.Plantagochi.cad;

import fr.exia.Plantagochi.model.Plante;
import fr.exia.Plantagochi.model.Serre;

public class FakeGenerator implements CAD{
	
	private Serre model = null;
	
	@Override
	public void setModel(Serre serre) {
		this.model = serre;
	}
	
	@Override
	public float getHumiditeSol(int IDPlante){
		return (float) (Math.random() * 100);
	}
	
	@Override
	public float getHumiditeAir(int IDPlante){
		return (float) (Math.random() * 100);
	}
	
	@Override
	public float getTemperatureAir(int IDPlante){
		return (float) ( Math.random() * 40);
	}
	
	@Override
	public float getLuminosite(int IDPlante){
		return (float) (Math.random() * 100);
	}
	@Override
	public void run(){
		
		
		
		while(true){
			try{
				Thread.sleep(1000);
			}
			catch(Exception ex){
				return;
			}
			
			int i =1;
			
			for(Plante plante: model.getPlantes()){
				plante.setHumiditeAir(getHumiditeAir(i));
				plante.setHumiditeSol(getHumiditeSol(i));
				//plante.setTauxLuminosite(getLuminosite(i));
				plante.setTemperatureAir(getTemperatureAir(i));
				plante.hasBeenChanged();
				plante.notifyObservers(i);
				i++;
					
			}			
		}
	}
}
