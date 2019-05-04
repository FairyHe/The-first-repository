package com.zhuhe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenChrome {
    public static void main(String[] args) {

        //在谷歌浏览器chrome://version/，选择可执行文件路径
        System.setProperty("webdriver.chrome.driver","E:\\softeware\\chromedriver.exe");
//实例化一个Chrome浏览器的实例
        WebDriver driver = new ChromeDriver();
//设置打开的浏览器窗口最大化
        driver.manage().window().maximize();
//设置隐性的等待时间
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//使用get()打开一个网站
        driver.get("https://www.baidu.com");
//getTitle()获取当前页面的title，用System.out.println()打印在控制台
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
//关闭浏览器
        //driver.quit();

    }
}
