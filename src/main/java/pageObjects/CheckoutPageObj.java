package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageObj {
  public WebDriver driver;
  By SubmitButton = By.id("submitCheckForm");
  By AllertBox = By.xpath("//*[@id='ngdialog1']/div[2]/div[1]");
  By ABoxButtonOK = By.xpath("//*[@id='ngdialog1']/div[2]/div[1]/div[3]/div");

  public CheckoutPageObj(WebDriver driver) {
    this.driver = driver;

  }

  public WebElement getSubmitButton() {
    return driver.findElement(SubmitButton);

  }

  public WebElement getAllertBox() {
    return driver.findElement(AllertBox);

  }

  public WebElement getABoxButtonOK() {
    return driver.findElement(ABoxButtonOK);

  }
}

