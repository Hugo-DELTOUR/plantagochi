package fr.exia.Plantagochi.model;

import java.util.ArrayList;
import java.util.List;

public class Serre {
	
	private List<Plante> plantes;

	
	public Serre() {
		this.plantes = new ArrayList<>();
	}

	public List<Plante> getPlantes() {
		return plantes;
	}
	
	public Plante getPlantes(int IDPlante){
		for(Plante plante : this.plantes){
			if(plante.getIDPlante() == IDPlante){
				return plante;
			}
		}
		return null;
	}
	
	public void addPlante(Plante plante) {
		this.plantes.add(plante);
	}
	
	public void removePlante(Plante plante){
		this.plantes.remove(plante);
	}
	
	public List<Plante> getPlantesByEspece(Espece espece){
		List<Plante> output = new ArrayList<>();
		
//		for(int i = 0; i < plantes.size(); i++){
//			Plante p = plantes.get(i);
//			if(p.getEspece() == espece) output.add(p);
//		}
		
		for(Plante p : plantes){
			if(p.getEspece() == espece){
				output.add(p);
			}
		}
		
		return output;
	}
	
}
