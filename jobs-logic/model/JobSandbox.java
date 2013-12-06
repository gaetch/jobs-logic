import java.text.ParseException;

import fr.gaetch.job.Job;
import fr.gaetch.job.JobService;
import fr.gaetch.job.Project;

public class JobSandbox {
	public static void main(String[] args) {
		try {
			Job devAtArhs = JobService.create(
				"ARHS Consulting",
				"ARHS Luxembourg",
				"2b",
				"CUL_DE_SAC",
				"Nicolas Bové",
				"L-1111",
				"Luxembourg",
				"Luxembourg",
				"Java developper",
				"14/10/2013"
			);

			Project m1ss = JobService.addProject(
				devAtArhs,
				"M1SS",
				"Mini One Stop Shop",
				"14/10/2013"
			);

			System.out.println(devAtArhs);
			System.out.println(devAtArhs.getOffice());
			System.out.println(m1ss);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}