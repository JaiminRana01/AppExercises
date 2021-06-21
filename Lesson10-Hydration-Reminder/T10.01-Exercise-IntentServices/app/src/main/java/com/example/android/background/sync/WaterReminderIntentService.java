package com.example.android.background.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

//  COMPLETED (9) Create WaterReminderIntentService and extend it from IntentService
public class WaterReminderIntentService extends IntentService {
    //   COMPLETED (10) Create a default constructor that calls super with the name of this class
    public WaterReminderIntentService() {
        super("WaterReminderIntentService");
    }

    //   COMPLETED (11) Override onHandleIntent
    @Override
    protected void onHandleIntent(Intent intent) {
        //       COMPLETED (12) Get the action from the Intent that started this Service
        String action = intent.getAction();
        //       COMPLETED (13) Call ReminderTasks.executeTask and pass in the action to be performed
        ReminderTasks.executeTask(this, action);
    }


}