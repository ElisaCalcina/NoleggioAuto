package polito.it.noleggio.model;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TestSimulator {

	public static void main(String args[]) {
		Simulator sim = new Simulator();
		
		//imposto parametri di simulazione
		sim.setNumCars(13) ; //numero auto totale
		sim.setClientFrequency(Duration.of(10, ChronoUnit.MINUTES)) ; //frequenza con cui i clienti arrivano
		
		//esecuzione simulatore --> simula la giornata di lavoro del noleggio
		sim.run() ;
		
		//chiedo al simulatore quanti clienti sono arrivati e quanti non sono soddisfatti (richiesta)
		int totClients = sim.getClienti() ;
		int dissatisfied = sim.getInsoddisfatti() ;
		
		//li stampo
		System.out.format("Arrived %d clients, %d were dissatisfied\n", 
				totClients, dissatisfied);
	}
	
}
