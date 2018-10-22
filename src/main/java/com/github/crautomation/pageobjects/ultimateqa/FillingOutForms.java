package com.github.crautomation.pageobjects.ultimateqa;

import com.github.crautomation.core.ui.test.BasePageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * <p> UltimateQA - Big Elements Page </p>
 *
 * Located: https://www.ultimateqa.com/automation/complicated-page
 */
public class FillingOutForms extends BasePageObject<FillingOutForms>
{
    @FindBy(css = "input[id='et_pb_contact_name_1']")
    private WebElement contactFormNameInput;

    @FindBy(css = "textarea[name=et_pb_contact_message_1]")
    private WebElement contactFormMessageInput;

    @FindBy(css = "button[class='et_pb_contact_submit et_pb_button']")
    private WebElement submitButton;

    FillingOutForms(final WebDriver driver)
    {
        super(driver);
        initElements();
    }

    @Step("Entering {username} into the contact name input.")
    public FillingOutForms enterContactName(final String username)
    {
        contactFormNameInput.sendKeys(username);

        return this;
    }

    @Step("Entering {message} into the contact message input.")
    public FillingOutForms enterContactMessage(final String message)
    {
        contactFormMessageInput.sendKeys(message);

        return this;
    }

    @Step("Clicking the submit button")
    public FillingOutForms clickSubmitButton()
    {
        submitButton.click();

        return this;
    }
}
