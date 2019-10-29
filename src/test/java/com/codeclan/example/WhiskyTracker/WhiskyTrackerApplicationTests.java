package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findByYear2018() {
		List<Whisky> foundWhiskies = whiskyRepository.findByYear(2018);
		assertEquals(2018, foundWhiskies.get(0).getYear());
	}

	@Test
	public void findDistilleryByRegionSpeyside() {
		List<Distillery> foundDistilleries = distilleryRepository.findDistilleryByRegion("Speyside");
		assertEquals("Speyside", foundDistilleries.get(0).getRegion());
		assertEquals(2, foundDistilleries.size());
	}

	@Test
	public void canFindWhiskiesWithAge12() {
		List<Whisky> foundWhiskies = whiskyRepository.findWhiskiesThatHaveAge(12);
		assertEquals();
	}

}
