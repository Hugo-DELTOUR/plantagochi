package main;

import javax.swing.SwingUtilities;

import fr.exia.Plantagochi.cad.CAD;
import fr.exia.Plantagochi.cad.FakeGenerator;
import fr.exia.Plantagochi.ctrl.WindowController;
import fr.exia.Plantagochi.model.Espece;
import fr.exia.Plantagochi.model.Plante;
import fr.exia.Plantagochi.model.Serre;

public class Main {

	public static void main(String[] args) {
		
		Serre serre = new Serre();
		
		Espece espece = new Espece("Tomate","Solanum lycopersicum L.");
		Espece espece2 = new Espece("Persil","Petroselinum crispum");
		
		Plante plante = new Plante(1, espece);
		Plante plante2 = new Plante(2, espece2);
		
		serre.addPlante(plante);
		serre.addPlante(plante2);
		
		WindowController control = new WindowController(serre);
		
		//control.run();
		SwingUtilities.invokeLater(control);
		
		CAD cad = new FakeGenerator();
		cad.setModel(serre);
		
		Thread t = new Thread(cad);
		t.start();
		
	}
	
}
