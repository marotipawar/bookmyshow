package com.maroti.page;

import com.maroti.base.MyWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class AbstractBookMyShow implements BookMyShow {

    @FindBy(xpath = "//div[@class='sc-cCbXAZ eVrcae']/ul/li//span")
    protected List<WebElement> cities;
    public MyWebDriver driver;

    public AbstractBookMyShow(MyWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver.getDriverInstance(), this);
    }




    @Override
    public void selectCity() {

    }
}
