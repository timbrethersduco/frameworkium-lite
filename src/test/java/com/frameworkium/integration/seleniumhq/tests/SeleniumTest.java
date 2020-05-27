package com.frameworkium.integration.seleniumhq.tests;

import com.frameworkium.lite.ui.tests.BaseUITest;
import com.frameworkium.integration.seleniumhq.pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest extends BaseUITest {

    public final void component_example_test() {
        String latestVersion = HomePage.open()
                .getHeader()
                .clickDownloadLink()
                .getLatestVersion();

        assertThat(latestVersion).matches("\\d\\.\\d+\\.\\d+");
    }
}
