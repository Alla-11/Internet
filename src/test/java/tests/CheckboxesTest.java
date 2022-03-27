package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest{
    private  static  final String BASE_URL = "http://the-internet.herokuapp.com/checkboxes";
    private boolean value_of_check_checkbox;

    @Test (priority = 0)
    public void firstCheckboxUncheckedTest(){
        driver.get(BASE_URL);
        value_of_check_checkbox = driver.findElement(By.cssSelector("input[type='checkbox']:first-child")).isSelected();
        Assert.assertFalse(value_of_check_checkbox);
    }

    @Test (priority = 1)
    public void secondCheckboxCheckedTest(){
        driver.get(BASE_URL);
        value_of_check_checkbox = driver.findElement(By.cssSelector("input[type='checkbox']:last-child")).isSelected();
        Assert.assertTrue(value_of_check_checkbox);
    }
    @Test (priority = 2)
    public void secondCheckboxUncheckedAfterCheckTest(){
        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("input[type='checkbox']:last-child")).click();
        value_of_check_checkbox = driver.findElement(By.cssSelector("input[type='checkbox']:last-child")).isSelected();
        Assert.assertFalse(value_of_check_checkbox);
    }
}
