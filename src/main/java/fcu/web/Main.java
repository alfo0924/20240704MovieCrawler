package fcu.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vscinemas.com.tw/vsweb/film/index.aspx");
        System.out.println(driver.getTitle());

        try{
//        **
        List<WebElement> elements = driver.findElements(By.cssSelector(".movieList .infoArea"));


        for(WebElement element : elements) {
            WebElement nameElement = element.findElement(By.cssSelector("a"));
            WebElement engNameElement = element.findElement(By.cssSelector("h3"));
            WebElement startDateElement = element.findElement(By.cssSelector("time"));
            System.out.print(nameElement.getText()+"\t");
            System.out.print(engNameElement.getText()+"\t");
            System.out.println(startDateElement.getText());
        }
            List<WebElement> elements2 = driver.findElements(By.cssSelector(".mainLink "));
        for(WebElement element : elements2) {
            WebElement nameElement = element.findElement(By.cssSelector("a"));
            System.out.print(nameElement.getText()+"\t");
        }
//**
        }catch(NoSuchElementException e) {
         e.printStackTrace();

        }
        finally {
            driver.quit();
        }


        WebDriver driver2=new ChromeDriver();
        driver2.get("https://tw.news.yahoo.com/%E5%8F%B0%E7%81%A3%E6%97%85%E8%A1%8C%E5%9C%98%E6%90%AD%E5%8D%97%E9%9F%93%E8%A7%80%E5%85%89%E5%B7%B4%E5%A3%AB%E8%BB%8A%E7%A6%8D-%E4%B8%80%E5%8F%B0%E7%B1%8D%E9%81%8A%E5%AE%A2%E5%8F%97%E5%82%B7-005818267.html");
        System.out.println(driver2.getTitle());
        driver2.quit();

        WebDriver driver3=new ChromeDriver();
        driver3.get("https://tw.news.yahoo.com/world/archive/");
        System.out.println(driver3.getTitle());
        driver3.quit();








    }
}