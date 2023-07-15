package com.maroti.base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public abstract class AbstractMyWebDriver implements MyWebDriver {

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        AbstractMyWebDriver.driver = driver;
    }

    @Override
    public WebDriver getDriverInstance() {
        return driver;
    }

    @Override
    public void goTo(String url) {
        driver.get(url);
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public void maximize() {
        driver.manage().window().maximize();
    }

    @Override
    public void minimize() {
        driver.manage().window().minimize();
    }

    @Override
    public void javaScriptClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click", element);
    }

    @Override
    public void javaScriptSendKeys(WebElement element, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + value + "'", element);
    }

    @Override
    public void actionClick(WebElement click) {
        Actions act = new Actions(driver);
        act.click(click).build().perform();
    }

    @Override
    public void actionsSendKeys(WebElement element, String value) {
        Actions act = new Actions(driver);
        act.sendKeys(element, value).build().perform();
    }

    @Override
    public void implicitlyWait(int second) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
    }

    @Override
    public WebDriverWait explicitlyWait(int second) {
        return new WebDriverWait(driver, Duration.ofSeconds(second));
    }

    @Override
    public File screenshot(String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.FILE);

    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }
}
