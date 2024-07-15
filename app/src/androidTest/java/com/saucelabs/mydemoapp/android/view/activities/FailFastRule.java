package com.saucelabs.mydemoapp.android.view.activities;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FailFastRule extends TestWatcher {
    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        // Fail fast by throwing a RuntimeException
        throw new RuntimeException("Test failed, stopping further test execution.");
    }
}
