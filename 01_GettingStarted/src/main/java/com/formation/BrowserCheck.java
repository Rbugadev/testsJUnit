package com.formation;

public class BrowserCheck {

	public static void main(String[] args) {
		String chromeDriverPath = "C:\\tools\\selenium\\chromedriver.exe";
		String firefoxDriverPath = "C:\\tools\\selenium\\geckodriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.setProperty("webdriver.firefox.driver", firefoxDriverPath);

	}

}
