package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static core.BaseTests.getDriver;

public class Dsl extends BaseTests{

    /***** TextField e TextArea  *****/

    public void writeField(By by, String text) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(text);

    }

    public void writeField(String id_field, String text) {
        writeField(By.id(id_field), text);
    }

    public void writeFieldXpath(String xpath_field, String text) {
       writeField(By.xpath(xpath_field), text);

    }

    public String getValueInput(String id_field) {
        return getDriver().findElement(By.id(id_field)).getAttribute("value");
    }

    /***** Radio e Check  *****/

    public void clickRadio(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public boolean isRadioCheck(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }

    public void selectCombo(String id, String value) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(value);
    }

    public String getValueCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public void clickButton(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public void clickLink(String link) {
        getDriver().findElement(By.linkText(link)).click();
    }

}
