package pageClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.DriverFactory;

public class MySiNetPage extends DriverFactory{

    @FindBy(id = "ptpglts")
            private WebElement MyFavourites;

    public MySiNetPage(WebDriver driver){
           PageFactory.initElements(driver, this);
    }

    public void I_should_be_signed_in() throws Throwable {
        boolean myfavouriteslink = MyFavourites.isDisplayed();
        Assert.assertTrue(myfavouriteslink);
    }
}
