package com.example.bmh0011.translate;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

/**
 * Created by Matt on 11/7/2014.
 */
public class LaunchActivityTest extends ActivityUnitTestCase<MyActivity> {

    public LaunchActivityTest(Class<MyActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent mLaunchIntent = new Intent(getInstrumentation()
                .getTargetContext(), MyActivity.class);
        startActivity(mLaunchIntent, null, null);
        final Button launchNextButton =
                (Button) getActivity()
                        .findViewById(R.id.bSpeak);
    }

}
