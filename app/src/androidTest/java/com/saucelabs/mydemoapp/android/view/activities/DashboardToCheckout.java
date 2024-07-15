package com.saucelabs.mydemoapp.android.view.activities;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.saucelabs.mydemoapp.android.BaseTest;
import com.saucelabs.mydemoapp.android.HappyFlow;
import com.saucelabs.mydemoapp.android.R;
import com.saucelabs.mydemoapp.android.actions.NestingAwareScrollAction;
import com.saucelabs.mydemoapp.android.view.activities.FailFastRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;

import static org.junit.Assert.*;

@LargeTest
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Ensures tests are run in alphabetical order
public class DashboardToCheckout extends BaseTest {

    //This ViewAction For Nested ScrollView
    private final ViewAction scroll = new NestingAwareScrollAction();

    @Rule
    public TestRule failFastRule = RuleChain.outerRule(new FailFastRule());

    @Rule
    public ActivityScenarioRule<SplashActivity> activityRule = new ActivityScenarioRule<>(SplashActivity.class);

    @Before
    public void setUp(){

    }

    @Test
    public void testA_Example1() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testB_ThatCrashes() {
        // Simulate an immediate test exit by throwing a RuntimeException
        throw new RuntimeException("Deliberate crash for testing purposes.");
    }

    @Test
    public void testC_Example2() {
        assertEquals(5, 2 + 2);
        // This test should not run if testA_ThatCrashes fails
    }
}
