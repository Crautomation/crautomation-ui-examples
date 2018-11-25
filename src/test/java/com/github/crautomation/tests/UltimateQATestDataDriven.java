package com.github.crautomation.tests;

import com.github.crautomation.core.ui.test.BaseUITestCase;
import com.github.crautomation.core.ui.util.ParallelExecution;
import com.github.crautomation.globalconstants.TestFeatures;
import com.github.crautomation.globalconstants.TestGroups;
import com.github.crautomation.pageobjects.ultimateqa.FillingOutForms;
import com.github.crautomation.pageobjects.ultimateqa.Homepage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UltimateQATestDataDriven extends BaseUITestCase
{
    @DataProvider(name = "testData", parallel = ParallelExecution.STATUS)
    public Object[][] testData()
    {
        return new Object[][]
                {
                        {
                                "Data Driven Test Scenario 1 - Pass", "Test Name 1", "Text Box input message..."
                        },
                        {
                                "Data Driven Test Scenario 2 - Fail", "Test Name 2 ", "Text Box input message..."
                        }
                };
    }


    @Severity(SeverityLevel.NORMAL)
    @Feature(TestFeatures.TEST_PASSED_FEATURE)
    @Description("Navigates to the Ultimate QA Test 'Filling out forms' page and fill in details.")
    @Test(  dataProvider = "testData",
            groups = { TestGroups.ULTIMATE_QA, TestGroups.REGRESSION },
            description = "UltimateQATestDataDriven")
    public void ultimateQATestDataDriven(final String testName, final String name, final String password)
    {
        log.info("Starting " + testName);

        final FillingOutForms fillingOutForms = new Homepage()
                .open().then().openFillingOutFormsPage();

        fillingOutForms.enterContactName(name).and().enterContactMessage(password)
                .then().clickSubmitButton();
    }
}
