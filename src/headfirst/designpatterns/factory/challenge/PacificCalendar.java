package headfirst.designpatterns.factory.challenge;

import java.util.*;

public class PacificCalendar extends Calendar {
    List<String> calenderAppointments = new ArrayList<String>();
		
	public PacificCalendar(ZoneFactory zoneFactory) {
		zone = zoneFactory.createZone("US/Pacific");
		// make a calendar for the pacific zone
		// ...
	}
	public void createCalendar(List<String> appointments) {
		calenderAppointments.addAll(appointments);

		// make calendar from appointments
		System.out.println("Making the calendar");
		
	}
	public void print()
	{
		super.print();
        System.out.println("Printing all the appointments"+calenderAppointments.toString());
	}
}