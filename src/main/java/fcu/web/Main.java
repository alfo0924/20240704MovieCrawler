package fcu.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vscinemas.com.tw/vsweb/film/index.aspx");
        System.out.println(driver.getTitle());

    }
}