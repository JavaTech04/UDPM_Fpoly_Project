package com.example.staffmanager.demoTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Slf4j
public class SeleniumTest {
    private WebDriver web;
    @Test
    public void test() throws InterruptedException {
        log.info("============== Selenium Running ==============");
        web = new ChromeDriver();
        web.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "\\freelancer\\TTS_Java_Freelancer\\chromedriver_win32\\chromedriver.exe");
        web.get("http://localhost:8080");
        Thread.sleep(1000);
        web.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/table/tbody[1]/tr/td[6]/a[3]")).click();
    }
}
