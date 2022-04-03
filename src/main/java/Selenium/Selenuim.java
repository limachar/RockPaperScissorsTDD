package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenuim {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://lima-frontend.herokuapp.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);

        WebElement messagebox = driver.findElement(By.id("msg-t"));
        WebElement searchBtn = driver.findElement(By.id("btn"));

        messagebox.sendKeys("bra!");
        searchBtn.click();

        driver.quit();

    }
}
