package com.maroti.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class BookMyShowLandingPage extends AbstractMyWebDriver {


    private static BookMyShowLandingPage landingPage = null;
    private MyWebDriver driver;

    private BookMyShowLandingPage() {

    }

    public static MyWebDriver onChrome() {
        if (landingPage == null) {
            setDriver(new ChromeDriver());
            landingPage = new BookMyShowLandingPage();
            landingPage.goTo("https://www.bookmyshow.com");
            landingPage.maximize();
            landingPage.implicitlyWait(40);

        }
        return landingPage;
    }

    public static MyWebDriver onFirefox() {
        if (landingPage == null) {
            setDriver(new ChromeDriver());
            landingPage = new BookMyShowLandingPage();
            landingPage.goTo("https://www.bookmyshow.com");
            landingPage.maximize();
            landingPage.implicitlyWait(40);

        }
        return landingPage;
    }

    public static MyWebDriver onEdge() {
        if (landingPage == null) {
            setDriver(new EdgeDriver());
            landingPage = new BookMyShowLandingPage();
            landingPage.goTo("https://www.bookmyshow.com");
            landingPage.maximize();
            landingPage.implicitlyWait(40);

        }
        return landingPage;
    }


}
