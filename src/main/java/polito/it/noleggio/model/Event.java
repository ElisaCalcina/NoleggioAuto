package polito.it.noleggio.model;
//questa classe ci serve per creare il singolo evento di simulazione

import java.time.LocalTime;

public class Event implements Comparable<Event> {
	//due campi sempre presenti: tempo (marcatura temporale) e tipo di evento che può essere di due tipi diversi (usiamo l'enumerazione in java)
	//enumerazione= classe annidata all'interno di questa
	
	public enum EventType{
		//ha elenco di costanti che devono essere definite
		NEW_CLIENT, CAR_RETURNED //--> due eventi che stiamo modellando
	}
	
	//attributi che abbiamo sempre
	private LocalTime time;
	private EventType type;
	
	public Event(LocalTime time, EventType type) {
		super();
		this.time = time;
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	//in ordine di tempo
	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}

	
	

}
