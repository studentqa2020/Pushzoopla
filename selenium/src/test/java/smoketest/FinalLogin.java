package smoketest;

import org.openqa.selenium.WebDriver;

import com.generic.cod.BaseLogin;

public class FinalLogin {

	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver= BaseLogin.getlogin();

		Thread.sleep(2000);
		driver.quit();
	}

	
}
