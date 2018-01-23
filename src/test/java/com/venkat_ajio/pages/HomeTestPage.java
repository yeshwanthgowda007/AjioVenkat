package com.venkat_ajio.pages;

import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "home.category.link")
	private QAFWebElement homeCategoryLink;
	@FindBy(locator = "home.subcategory.link")
	private QAFWebElement homeSubcategoryLink;
	@FindBy(locator = "home.popup.link")
	private QAFWebElement homePopupLink;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomeCategoryLink() {
		return homeCategoryLink;
	}

	public QAFWebElement getHomeSubcategoryLink() {
		return homeSubcategoryLink;
	}
	public QAFWebElement getHomePopupLink() {
		return homePopupLink;
	}

	public void launchApplication() throws InterruptedException
	{
		driver.get("/");
		driver.manage().window().maximize();
		
		
	}

	public void clickPopup()
	{
		try
		{
			if(getHomePopupLink().isDisplayed() && getHomePopupLink().isPresent())
			{
				getHomePopupLink().click();
			}
	}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	//select category and sub_category from menu
	//Yashwanth
	public void selectCategory(String categorytype , String subcategorytype )
	{
		QAFExtendedWebElement category = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("home.category.link"), categorytype));
		Actions actions = new Actions(driver);
		actions.moveToElement(category).perform();
		
		QAFExtendedWebElement subcategory = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("home.subcategory.link"), subcategorytype));
		subcategory.waitForVisible();
		subcategory.click();
	}
}
