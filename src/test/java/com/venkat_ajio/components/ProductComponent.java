package com.venkat_ajio.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductComponent extends QAFWebComponent {
	public ProductComponent(String locator) {
		super(locator);
		
	}
	@FindBy(locator = "searchresults.brand.link")
	private QAFWebElement searchresultsBrandLink;
	@FindBy(locator = "searchresults.price.link")
	private QAFWebElement searchresultsPriceLink;
	@FindBy(locator = "searchresults.pname.link")
	private QAFWebElement searchresultsPnameLink;
	public QAFWebElement getSearchresultsBrandLink() {
		return searchresultsBrandLink;
	}
	public QAFWebElement getSearchresultsPriceLink() {
		return searchresultsPriceLink;
	}
	public QAFWebElement getSearchresultsPnameLink() {
		return searchresultsPnameLink;
	}

}
