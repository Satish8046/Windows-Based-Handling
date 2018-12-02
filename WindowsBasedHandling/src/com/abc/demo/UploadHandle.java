package com.abc.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadHandle {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String url="C:\\Users\\Admin\\sat.html";
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='upload']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\sati.exe");
	}

}
