package org.browserlaunch;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utillities.Baseclass;
import org.utillities.FBLoginPagePojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends Baseclass {
	public static void main(String[] args) throws IOException {
		launchChrome();
		loadurl("https://www.facebook.com");
		winmax();
		printtitle();
		printcurrenturl();
		FBLoginPagePojo f=new FBLoginPagePojo();
		fill(f.getTxtUser(), getdata(1, 0));
		fill(f.getTxtPass(), getdata(3, 2));
		btnclick(f.getBtnLogin());
		closeBrowser();
		
	}

}
