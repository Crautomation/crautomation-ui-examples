package com.github.crautomation.tests;

import com.github.crautomation.core.ui.test.BaseUITestCase;
import com.github.crautomation.globalconstants.TestFeatures;
import com.github.crautomation.globalconstants.TestGroups;
import com.github.crautomation.pageobjects.ultimateqa.BigElementsPage;
import com.github.crautomation.pageobjects.ultimateqa.Homepage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UltimateQATestFail extends BaseUITestCase
{
    @Severity(SeverityLevel.NORMAL)
    @Feature(TestFeatures.TEST_FAILURE_FEATURE)
    @Description("Navigates to UltimateQA and uses SizzleSelector to click specific button on the Big Elements page " +
            "which will fail.")
    @Test(groups = { TestGroups.ULTIMATE_QA, TestGroups.REGRESSION }, description = "UltimateQATestFail")
    public void ultimateQATestFail()
    {
        log.info("Starting UltimateQATestFail...");

        final BigElementsPage bigElementsPage = new Homepage()
                .open().then().openBigElementsPage();

        assertThat("Button was not located with Sizzle", bigElementsPage.canButtonBeFoundWithSizzle(),
                is(false));
    }
}