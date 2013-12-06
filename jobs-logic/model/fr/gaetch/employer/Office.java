package fr.gaetch.employer;

import fr.gaetch.contact.MiscContactPoint;
import fr.gaetch.location.Location;

public class Office extends MiscContactPoint {
	private final Employer employer;
	private final Location location;

	public Office(final Employer employer, final Location location, final String name) {
		super(name);
		this.employer = employer;
		this.location = location;
	}

	public Employer getEmployer() {
		return this.employer;
	}

	public Location getLocation() {
		return this.location;
	}

	public String toString() {
		return "Office address: " + this.location;
	}
}