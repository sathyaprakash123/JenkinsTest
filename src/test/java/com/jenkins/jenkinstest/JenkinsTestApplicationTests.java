package com.jenkins.jenkinstest;

import org.jboss.logging.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jenkins.jenkinstest.service.GetDayOfWeek;



@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsTestApplicationTests {

	@Autowired
	GetDayOfWeek getdayofweek;

	static Logger logger = Logger.getLogger(JenkinsTestApplicationTests.class.getName());

	@BeforeClass
	public static void testingDaysAndRand() {

		logger.info("Starting Day Of Week Tests");
	}

	@Test
	public void getDayOfWeekTest() {

		logger.info("About to test day of week test case");
		Assert.assertEquals("Sun", getdayofweek.getDayOfWeek());

	}

	@Test
	public void getRandomNumberTest() {
		logger.info("Starting Random Number Tests");
		Assert.assertEquals(getdayofweek.getRandomNumber() > 0, getdayofweek.getRandomNumber() > 0);
	}

}
