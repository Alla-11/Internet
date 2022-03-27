package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest{
    private static final String BASE_URL = "http://the-internet.herokuapp.com/dropdown";
    private static String DROPDOWN_ID = "dropdown";
    private static String FIRST_VALUE_ID_SELECT = "1";
    private static String SECOND_VALUE_ID_SELECT = "2";
    String first_value_of_seleсt = "Option 1";
    String second_value_of_select = "Option 2";

    @Test
    public void selectedFirstElementTest(){
        driver.get(BASE_URL);
        Select select = new Select(driver.findElement(By.id(DROPDOWN_ID)));
        select.selectByValue(FIRST_VALUE_ID_SELECT);
        String real_result = select.getFirstSelectedOption().getText();
        Assert.assertEquals(first_value_of_seleсt,real_result);
    }

    @Test
    public void selectedSecondElementTest(){
        driver.get(BASE_URL);
        Select select = new Select(driver.findElement(By.id(DROPDOWN_ID)));
        select.selectByValue(SECOND_VALUE_ID_SELECT);
        String real_result = select.getFirstSelectedOption().getText();
        Assert.assertEquals(second_value_of_select,real_result);
    }
}
