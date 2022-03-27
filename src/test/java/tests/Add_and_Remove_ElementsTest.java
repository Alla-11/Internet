package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_and_Remove_ElementsTest extends BaseTest{
    private  static  final String BASE_URL = "http://the-internet.herokuapp.com/add_remove_elements/";
    private int number_clik_add = 2;
    private int number_clik_del = 1;
    private int number_of_elements_on_page_after_clik = 0;


    @Test
    public void addTwoElementsRemoveOneElementTest(){
        driver.get(BASE_URL);
        for (int i = 0; i < number_clik_add; i++) {
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }
        for (int i = 0; i < number_clik_del; i++) {
            driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        }
        number_of_elements_on_page_after_clik = driver.findElements(By.xpath("//button[@onclick='deleteElement()']")).size();
        Assert.assertEquals(number_of_elements_on_page_after_clik,number_clik_add-number_clik_del);
    }
}
