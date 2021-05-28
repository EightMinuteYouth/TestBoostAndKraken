package com.badyouth.testapp;

import android.app.Application;
import android.content.Context;

import com.idlefish.flutterboost.FlutterBoost;
import com.idlefish.flutterboost.Platform;
import com.idlefish.flutterboost.interfaces.INativeRouter;

import java.util.Map;

public class MyApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();

    INativeRouter router = (Context context, String url, Map<String, Object> urlParams, int i, Map<String, Object> map1) -> {
//        PageRouter.openPageByUrl(context, url, urlParams);
    };

    Platform platform = new FlutterBoost
            .ConfigBuilder(this, router)
            .whenEngineStart(FlutterBoost.ConfigBuilder.ANY_ACTIVITY_CREATED)
            .build();
    FlutterBoost.instance().init(platform);
  }
}
