package fr.gaetch.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Project {
	private final Job job;
	private String label;
	private String description;
	private final Date startDate;
	private Date endDate;

	public Project(final Job job, final String label, final String description, final Date startDate) {
		this.job = job;
		this.label = label;
		this.description = description;
		this.startDate = startDate;
	}

	public Job getJob() {
		return this.job;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
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
		return "Working on " + this.label + (
			this.endDate == null ?
				" since " + new SimpleDateFormat("dd/MM/yyyy").format(this.startDate)
			:
				" from " + new SimpleDateFormat("dd/MM/yyyy").format(this.startDate) + " to " + new SimpleDateFormat("dd/MM/yyyy").format(this.endDate));
	}
}