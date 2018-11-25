package com.github.crautomation.pageobjects.ultimateqa;

import com.github.crautomation.core.ui.test.BasePageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * <p> UltimateQA - Homepage </p>
 *
 * Located: https://www.ultimateqa.com/automation/
 */
public class Homepage extends BasePageObject<Homepage>
{
    @FindBy(css = "img[id=logo]")
    private WebElement logoImage;

    @FindBy(linkText = "Big page with many elements")
    private WebElement bigPageLink;

    @FindBy(linkText = "Fill out forms")
    private WebElement fillingOutFormsLink;

    public Homepage()
    {
        initElements();
    }

    @Step("Navigating to Ultimate QA Homepage")
    public Homepage open()
    {
        getDriver().navigate().to("https://www.ultimateqa.com/automation/");

        hasPageLoaded();

        return this;
    }

    @Step("Validating Homepage has loaded")
    private void hasPageLoaded()
    {
        assertThat("Homepage has not loaded.", logoImage.isDisplayed(), is(true));
    }

    @Step("Navigating to the 'Big Elements' page")
    public BigElementsPage openBigElementsPage()
    {
        bigPageLink.click();

        return new BigElementsPage();
    }

    @Step("Navigating to the 'Filling Out Forms' page")
    public FillingOutForms openFillingOutFormsPage()
    {
        fillingOutFormsLink.click();

        return new FillingOutForms();
    }
}
