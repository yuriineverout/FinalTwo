package tests;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertFalse;

@Slf4j
public class SubscribeWithInvalidEmail extends BaseTest {

    @Test
    public void checkErrorMessage() throws InterruptedException {
        MainPage mainPage = new MainPage();

        boolean isErrorTrue = mainPage
                .inputEmail("com@com")
                .clickBtn()
                .IsErrorMessageExistInEmailField();

        assertFalse(isErrorTrue);

    }


}
