package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    private static final String BASE_URL = "http://the-internet.herokuapp.com/typos";
    private static final String correct_text = "Typos\n" + "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
    "Sometimes you'll see a typo, other times you won't.";
    private static String text_on_page = "";

    @Test
    public void checkTextOnPage(){
        driver.get(BASE_URL);
        text_on_page = driver.findElement(By.cssSelector("div[class ='example']")).getText();
        Assert.assertEquals(text_on_page,correct_text);

    }
}
