package fr.exia.Plantagochi.ctrl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import fr.exia.Plantagochi.model.Plante;
import fr.exia.Plantagochi.model.Serre;
import fr.exia.Plantagochi.view.Window;

public class WindowController implements Runnable,Observer,ActionListener{

	private Serre model;
	private Window view;
	
	public WindowController(Serre serre) {
		this.model = serre;
		
		for (Plante plante: serre.getPlantes()){
			plante.addObserver(this);
		}
	}
	
	public Serre getModel(){
		return this.model;
	}
	
	public Window getView(){
		return this.view;
	}
	
	@Override
	public void run() {
		if(!SwingUtilities.isEventDispatchThread()){
			System.err.println("Erreur");
		}
		
		this.view = new Window();
		this.view.getBtnAllumer().addActionListener(this);
		this.view.setVisible(true);
		
	}
	
	public void update(Observable o, Object arg){
		
		if( o instanceof Plante ){
			
			Plante plante = (Plante) o;
			
			if(plante.getIDPlante() !=1 ) return;
			
			System.out.println("La plante " + arg + " a été mis à jour !!!");
			
			String HumAir = String.format("%.2f %%", plante.getHumiditeAir());
			this.view.getLabelHumiditeAir().setText(HumAir);
			
			String HumSol = String.format("%.2f %%", plante.getHumiditeSol());
			this.view.getLabelHumiditeSol().setText(HumSol);
			
			String TempAir = String.format("%.2f °C",plante.getTemperatureAir());
			this.view.getLabelTemperatureAir().setText(TempAir);
		
			if (plante.getTauxLuminosite() < 20){
				view.getBtnAllumer().setText("Allumer");
			}
			else {
				view.getBtnAllumer().setText("Eteint");
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("Eteindre")){
			this.model.getPlantes(1).setTauxLuminosite(0);
		}
		else{
			this.model.getPlantes(1).setTauxLuminosite(80);
		}
		this.model.getPlantes(1).hasBeenChanged();
		this.model.getPlantes(1).notifyObservers(1);
	}
}
