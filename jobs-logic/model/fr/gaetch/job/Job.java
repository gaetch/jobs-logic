package fr.gaetch.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.gaetch.employer.Office;

public class Job {
	private final Office office;
	private final String position;
	private final Date startDate;
	private Date endDate;

	public Job(final Office office, final String position, final Date startDate) {
		this.office = office;
		this.position = position;
		this.startDate = startDate;
	}

	public Office getOffice() {
		return this.office;
	}

	public String getPosition() {
		return this.position;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return
			this.position + " at " + this.office.getEmployer() + (
				this.endDate == null ?
					" since " + new SimpleDateFormat("dd/MM/yyyy").format(this.startDate)
				:
					" from " + new SimpleDateFormat("dd/MM/yyyy").format(this.startDate) + " to " + new SimpleDateFormat("dd/MM/yyyy").format(this.endDate)
			);
	}
}