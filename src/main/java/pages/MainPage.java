package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
@Getter
public class MainPage extends BasePage {


    @FindBy(xpath = "//div[@class='input-wrapper']/input")
    private WebElement input;
    @FindBy(xpath = "//input[@class='btn btn-primary float-xs-right hidden-xs-down']")
    private WebElement subscribeBtn;
    @FindBy(xpath = "//p[@class='alert alert-danger block_newsletter_alert']")
    private WebElement checkTheErrorMessage;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public MainPage inputEmail(String email) throws InterruptedException {
        scrollToElementWithJS(input);
        input.sendKeys(email);
        log.info("Scroll to the element & send the wrong email");
        return this;
    }

    public MainPage clickBtn() {
        subscribeBtn.click();
        log.info("Click on subscribe btn");
        return this;
    }

    public boolean IsErrorMessageExistInEmailField() {
        return IsErrorMessageExist(input);

    }
}
