package fr.gaetch.office;

import fr.gaetch.contact.MiscContactPoint;
import fr.gaetch.location.Location;
import fr.gaetch.person.JuridicalPerson;

public class Office extends MiscContactPoint {
	private final JuridicalPerson company;
	private final Location location;

	public Office(final JuridicalPerson company, final Location location, final String name) {
		super(name);
		this.company = company;
		this.location = location;
	}

	public JuridicalPerson getCompany() {
		return this.company;
	}

	public Location getLocation() {
		return this.location;
	}

	public String toString() {
		return "Office address: " + this.location;
	}
}