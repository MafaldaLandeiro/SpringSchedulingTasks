package org.SpringSchedulingTasks.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory
			.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat hourFormat = new SimpleDateFormat(
			"HH:mm:ss");

	// 3 min
	@Scheduled(fixedRate = 180000)
	public void reportTime() {
		log.info("Hours: " + hourFormat.format(new Date()));
	}

	// 22:20-25 
	@Scheduled(cron = "0 20-25 22 * * *")
	public void report10Clock() {
		log.info("It's now!!! Hours:" + hourFormat.format(new Date()));
	}

}
