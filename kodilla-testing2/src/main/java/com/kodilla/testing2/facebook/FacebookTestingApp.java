package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    final static String XPATH_OTHERCOOKIES= "//button[contains(@class, \"_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy\")]";
    final static String XPATH_NEWACCOUNT= "//div[contains(@class, \"_6ltg\")]/a";
    final static String XPATH_DAY="//select[contains(@name, \"birthday_day\")]";
    final static String XPATH_MONTH="//select[contains(@name, \"birthday_month\")]";
    final static String XPATH_YEAR="//select[contains(@name, \"birthday_year\")]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        driver.findElement(By.xpath(XPATH_OTHERCOOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEWACCOUNT)).click();

        while (!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByIndex(1);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(1);
    }


}
