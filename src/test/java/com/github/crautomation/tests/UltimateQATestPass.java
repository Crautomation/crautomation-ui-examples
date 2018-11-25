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

public class UltimateQATestPass extends BaseUITestCase
{
    @Severity(SeverityLevel.CRITICAL)
    @Feature(TestFeatures.TEST_PASSED_FEATURE)
    @Description("Navigates to UltimateQA and uses SizzleSelector to locate a specific button on the Big Elements page.")
    @Test(groups = { TestGroups.ULTIMATE_QA, TestGroups.REGRESSION }, description = "UltimateQATestPass")
    public void ultimateQATestPass()
    {
        log.info("Starting UltimateQATestPass...");

        final BigElementsPage bigElementsPage = new Homepage()
                .open().then().openBigElementsPage();

        assertThat("Button was not located with Sizzle", bigElementsPage.canButtonBeFoundWithSizzle(),
                is(true));
    }
}