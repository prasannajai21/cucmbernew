package kartdefini;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Baseclass;

public class loginpogo extends Baseclass {
	
	public loginpogo() {
		PageFactory.initElements(driver, this);
	}
    
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getMblenum() {
		return mblenum;
	}

	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mblenum;
	
}
