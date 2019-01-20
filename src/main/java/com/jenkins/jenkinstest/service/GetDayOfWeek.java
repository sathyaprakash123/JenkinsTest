package com.jenkins.jenkinstest.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class GetDayOfWeek {

	public String getDayOfWeek() {

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EE");
		System.out.println(format.format(date));
		return format.format(date);

	}

	public Integer getRandomNumber()

	{
		Random random = new Random();
		Integer randNumber = random.nextInt(100);
		return randNumber;

	}

}
