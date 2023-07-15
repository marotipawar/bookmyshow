package com.maroti.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public interface MyWebDriver extends WebDriver {
    WebDriver getDriverInstance();

    void goTo(String url);

    String getUrl();

    String getTitle();

    void maximize();

    void minimize();

    void javaScriptClick(WebElement element);

    void javaScriptSendKeys(WebElement element, String value);

    void actionClick(WebElement click);

    void actionsSendKeys(WebElement element, String value);

    void implicitlyWait(int second);

    WebDriverWait explicitlyWait(int second);

    File screenshot(String fileName);

    void destroy();
}
