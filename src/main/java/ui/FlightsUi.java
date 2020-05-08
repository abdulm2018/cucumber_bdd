package ui;

import org.openqa.selenium.By;

public class FlightsUi {
	public static final String ROUND_TRIP ="//label[@id='flight-type-roundtrip-label-hp-flight']";
	public static final By FLYING_FROM = By.xpath("//*[@id='flight-origin-hp-flight']");
	public static final By DESTINATION = By.xpath("//*[@id=\"flight-destination-hp-flight\"]");
	public static final By DEPARTING = By.xpath("//*[@id=\"flight-departing-single-hp-flight\"]");
	public static final By SEARCH = By.xpath("(//button[@type='submit']/span[text()='Search'])[1]");

}
