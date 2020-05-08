package actions;

import frameworkUtils.CoreUtils;
import ui.ExpediaUI;

public class ExpediaAction extends CoreUtils {
	public void navigateToExpediaHomePage() {
		driver.get(config.getData("Url"));
	}
	public void clickTab(String tabName) {

		click(ExpediaUI.tabElement(tabName));

	}
	
	public void clickFlightsTab() {
		click(ExpediaUI.FLIGHTS_TAB);
	}
	
}
