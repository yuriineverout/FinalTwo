package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void scrollToElementWithJS(WebElement element) throws InterruptedException {
        JavascriptExecutor executor = ((JavascriptExecutor) getDriver());
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(10000);
    }

    protected boolean IsErrorMessageExist(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return (Boolean) js.executeScript("return arguments[0].checkValidity();", element);
    }

}
