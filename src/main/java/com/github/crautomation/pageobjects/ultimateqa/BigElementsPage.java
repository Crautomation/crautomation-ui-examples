package com.github.crautomation.pageobjects.ultimateqa;

import com.github.crautomation.core.ui.test.BasePageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * <p> UltimateQA - Big Elements Page </p>
 *
 * Located: https://www.ultimateqa.com/automation/complicated-page
 */
public class BigElementsPage extends BasePageObject<BigElementsPage>
{
    BigElementsPage(final WebDriver driver)
    {
        super(driver);
        initElements();
    }

    @Step("Returning if the button can be found with sizzle")
    public boolean canButtonBeFoundWithSizzle()
    {
        final WebElement button = sizzle.findElementBySizzleCss(".et_pb_button.et_pb_button_8.et_pb_bg_layout_light");

        return button.isDisplayed();
    }
}
