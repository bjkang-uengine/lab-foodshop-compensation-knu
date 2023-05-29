package labfoodshopcompensation.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labfoodshopcompensation.FoodMenuApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FoodMenuApplication.class })
public class CucumberSpingConfiguration {}
