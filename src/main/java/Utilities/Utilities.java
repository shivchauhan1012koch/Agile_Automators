package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
    public static void click(WebDriver driver, By Button){
        WebElement btn= driver.findElement(Button);
        if(btn.isDisplayed())
            btn.click();
    }
    public static void jsClick(WebDriver driver, By element){
        WebElement btn= driver.findElement(element);
        JavascriptExecutor executor= (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",btn);  //Script is the Javascript that needs to execute.
    }
    public static void sendText(WebDriver driver, By element, String text){
        driver.findElement(element).clear();
        WebElement txtBox= driver.findElement(element);
        if(txtBox.isDisplayed())
            txtBox.sendKeys(text);
    }
    public static void scrollToBottom(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public static void scrollByPixels(WebDriver driver, int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }
//    public static void scrollToElement(WebDriver driver, By elementLocator) {         //additional function for scroll, In Page object we can use it like this : By myElementLocator = By.id("myElementId");    Utilities.scrollToElement(driver, myElementLocator);
//        WebElement element = driver.findElement(elementLocator);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//
//        // Scroll the element into view
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
//    }
}

//package Utilities;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Utilities {
//    public static void click(WebDriver driver, By button) {
//        if (driver == null || button == null) {
//            throw new IllegalArgumentException("Driver and button locator must not be null.");
//        }
//        WebElement btn = driver.findElement(button);
//        if (btn.isDisplayed()) {
//            btn.click();
//        }
//    }
//
//    public static void jsClick(WebDriver driver, By element) {
//        if (driver == null || element == null) {
//            throw new IllegalArgumentException("Driver and element locator must not be null.");
//        }
//        WebElement btn = driver.findElement(element);
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click()", btn);
//    }
//
//    public static void sendText(WebDriver driver, By element, String text) {
//        if (driver == null || element == null || text == null) {
//            throw new IllegalArgumentException("Driver, element locator, and text must not be null.");
//        }
//        WebElement txtBox = driver.findElement(element);
//        txtBox.clear();
//        if (txtBox.isDisplayed()) {
//            txtBox.sendKeys(text);
//        }
//    }
//
//    public static void scrollToBottom(WebDriver driver) {
//        if (driver == null) {
//            throw new IllegalArgumentException("Driver must not be null.");
//        }
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//    }
//
//    public static void scrollByPixels(WebDriver driver, int x, int y) {
//        if (driver == null) {
//            throw new IllegalArgumentException("Driver must not be null.");
//        }
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
//    }
//
//    public static void scrollToElement(WebDriver driver, By elementLocator) {
//        if (driver == null || elementLocator == null) {
//            throw new IllegalArgumentException("Driver and element locator must not be null.");
//        }
//        WebElement element = driver.findElement(elementLocator);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
//    }
//}

