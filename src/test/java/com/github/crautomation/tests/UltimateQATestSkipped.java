package com.github.crautomation.tests;

import com.github.crautomation.core.ui.test.BaseUITestCase;
import com.github.crautomation.globalconstants.TestFeatures;
import com.github.crautomation.globalconstants.TestGroups;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class UltimateQATestSkipped extends BaseUITestCase
{
    @Severity(SeverityLevel.MINOR)
    @Feature(TestFeatures.TEST_SKIPPED_FEATURE)
    @Description("Navigates to UltimateQA and uses SizzleSelector to click specific button on the Big Elements page " +
            "which will fail.")
    @Test(groups = { TestGroups.ULTIMATE_QA, TestGroups.REGRESSION }, description = "UltimateQATestSkipped")
    public void ultimateQATestSkipped()
    {
        log.info("Starting UltimateQATestSkipped...");

        throw new SkipException("Skipped Test...");
    }
}