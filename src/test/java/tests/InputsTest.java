package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    private  static  final String BASE_URL = "http://the-internet.herokuapp.com/inputs";
    private static String INPUT_NAME = "dropdown";
    private static String FIRST_SEND_TEXT = "12345678";
    private static String SECOND_SEND_TEXT = "World";
    String text_result = "";

    @Test
    public void enteringNumbersIntoInputTest(){
        driver.get(BASE_URL);
        driver.findElement(By.tagName("input")).sendKeys(FIRST_SEND_TEXT);
        text_result = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals(text_result,FIRST_SEND_TEXT);
    }

    @Test
    public void enteringWorldIntoInputTest(){
        driver.get(BASE_URL);
        driver.findElement(By.tagName("input")).sendKeys(SECOND_SEND_TEXT);
        text_result = driver.findElement(By.tagName("input")).getAttribute("value");
        Assert.assertEquals(text_result,SECOND_SEND_TEXT);
    }



}
