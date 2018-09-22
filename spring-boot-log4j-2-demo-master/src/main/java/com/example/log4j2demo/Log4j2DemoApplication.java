package com.example.log4j2demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2DemoApplication implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(Log4j2DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
	    String strDate = sdf.format(cal.getTime());
		logger.debug(strDate + "|" + "Debugging log");
		this.writeLog(LEVEL.DEBUG, strDate + "|" + "Debugging log");
		strDate = sdf.format(cal.getTime());
		logger.info(strDate + "|" + "Info log");
		this.writeLog(LEVEL.INFO, strDate + "|" + "Info log");
		strDate = sdf.format(cal.getTime());
		logger.warn(strDate + "|" + "Hey, This is a warning!");
		this.writeLog(LEVEL.WARNING, strDate + "|" + "Hey, This is a warning!");
		strDate = sdf.format(cal.getTime());
		logger.error(strDate + "|" + "Oops! We have an Error. OK");
		this.writeLog(LEVEL.ERROR, strDate + "|" + "Oops! We have an Error. OK");
		strDate = sdf.format(cal.getTime());
		logger.fatal(strDate + "|" + "Damn! Fatal error. Please fix me.");
		this.writeLog(LEVEL.FATAL, strDate + "|" + "Damn! Fatal error. Please fix me.");
	}
	
	public void writeLog(LEVEL level, String msg) {
		switch (level)
		{
			case INFO:    logger.info(msg);		break;
			case DEBUG:   logger.debug(msg);	break;
			case WARNING: logger.warn(msg);		break;
			case ERROR:   logger.error(msg);	break;
			case FATAL:   logger.fatal(msg);	break;			
		}
		
	}
}