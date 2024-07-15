package com.saucelabs.mydemoapp.android.view.activities;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FailFastRule extends TestWatcher {
    private static boolean hasFailed = false;

    @Override
    protected void starting(Description description) {
        if (hasFailed) {
						System.exit(1);
            throw new RuntimeException("Skipping test due to previous failure.");
        }
    }

    @Override
    protected void failed(Throwable e, Description description) {
        hasFailed = true;
    }
}
