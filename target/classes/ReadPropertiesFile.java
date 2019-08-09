package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {
  public WebDriver driver;
  protected static Properties prop = new Properties();

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream(
        "C:\\Users\\Вероника\\MAtests\\src\\main\\java\\resources\\config.properties");
    prop.load(fis);
  }

  static final String HOME_PAGE_URL = "URL";
  static final String CART_PAGE_URL = "CART_URL";
  static final String CHECKOUT_PAGE_URL = "CHECKOUT_URL";
  static final String SEARCH_TEST_PARAMETR = "SEARCH_TEST_PARAMETR";
  static final String SEARCH_TEST_FAIL_PARAMETR = "FAIL_PARAMETR";

  public String getHOME_PAGE_URL(Properties prop) {
    return prop.getProperty(HOME_PAGE_URL);
  }

  public String getCART_PAGE_URL_URL(Properties prop) {
    return prop.getProperty(CART_PAGE_URL);
  }


  public String getCHECKOUT_PAGE_URL(Properties prop) {
    return prop.getProperty(CHECKOUT_PAGE_URL);
  }

  public String getSEARCH_TEST_PARAMETR(Properties prop) {
    return prop.getProperty(SEARCH_TEST_PARAMETR);
  }


  public WebDriver IntialDriver() throws IOException {
    FileInputStream fis = new FileInputStream(
        "C:\\Users\\Вероника\\MAtests\\src\\main\\java\\resources\\config.properties");
    prop.load(fis);

    String browserName = prop.getProperty("browser");

    if (browserName.equals("chrome")) {
      System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
      driver = new ChromeDriver();

    } else if (browserName.equals("firefox")) {
      driver = new FirefoxDriver();
    } else if (browserName == "expl") {
    }
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }
}


