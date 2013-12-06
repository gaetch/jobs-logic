package fr.gaetch.job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.gaetch.employer.Employer;
import fr.gaetch.employer.Office;
import fr.gaetch.job.Job;
import fr.gaetch.job.Project;
import fr.gaetch.location.Address;
import fr.gaetch.location.City;
import fr.gaetch.location.Country;
import fr.gaetch.location.District;
import fr.gaetch.location.Location;
import fr.gaetch.location.RoadType;
import fr.gaetch.location.ZipCode;

public class JobService {
	public static Job create(
		final String employerName,
		final String officeName,
		final String number,
		final String roadTypeString,
		final String roadName,
		final String zipCodeString,
		final String cityString,
		final String countryString,
		final String position,
		final String startDateString
		) throws ParseException {
		// Employer
		Employer employer = new Employer(employerName);

		// Address
		final Location location;
		if (countryString != null) {
			Country country = Country.valueOf(countryString.toUpperCase());

			if (cityString != null) {
				City city = new City(country, cityString);

				if (zipCodeString != null) {
					ZipCode zipCode = new ZipCode(zipCodeString);
					District district = new District(city, zipCode);
	
					if ((roadTypeString != null) && (number != null) && (roadName != null) && (zipCode != null)) {
						RoadType roadType = RoadType.valueOf(roadTypeString.toUpperCase());
						Address address = new Address(number, roadType, roadName, district);
						location = address;
					}
					else {
						location = district;
					}
				}
				else {
					location = city;
				}
			}
			else {
				location = country;
			}
		}
		else {
			location = null;
		}

		// Office
		Office office = new Office(employer, location, officeName);

		// Job
		Date startDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(startDateString);
		return new Job(office, position, startDate);
	}

	public static Project addProject(
		final Job job,
		final String label,
		final String description,
		final String startDateString
		) throws ParseException {
		Date startDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(startDateString);

		return new Project(job, label, description, startDate);
	}
}