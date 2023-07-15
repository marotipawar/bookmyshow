package com.maroti.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public final class BookMyShowLandingPage extends AbstractMyWebDriver {


    private static BookMyShowLandingPage landingPage = null;
    private MyWebDriver driver;

    private BookMyShowLandingPage() {

    }

    public static MyWebDriver onChrome() {
        if (landingPage == null) {
            setDriver(new ChromeDriver());
            landingPage = new BookMyShowLandingPage();
            init();

        }
        return landingPage;
    }

    public static MyWebDriver onFirefox() {
        if (landingPage == null) {
            setDriver(new FirefoxDriver());
            landingPage = new BookMyShowLandingPage();
           init();

        }
        return landingPage;
    }

    public static MyWebDriver onEdge() {
        if (landingPage == null) {
            setDriver(new EdgeDriver());
            landingPage = new BookMyShowLandingPage();
            init();
        }
        return landingPage;
    }


    private static void init(){
        landingPage.goTo("https://www.bookmyshow.com");
        landingPage.maximize();
        landingPage.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        landingPage.implicitlyWait(30);
    }

    public void destroy(){
        setDriver(null);
        landingPage = null;
    }
}
