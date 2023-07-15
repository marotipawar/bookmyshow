package com.maroti.page;

import com.maroti.base.BookMyShowLandingPage;
import com.maroti.base.MyWebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractBookMyShow {


    public HomePage(MyWebDriver driver) {
        super(driver);

    }

    @Override
    public void selectCity() {
        cities.forEach(city->{
            if(city.getText().equalsIgnoreCase("pune")){
                city.click();
            }
        });
    }

    public static void main(String[] args) {
        MyWebDriver driver=BookMyShowLandingPage.onChrome();
        new HomePage(driver).selectCity();
    }
}
