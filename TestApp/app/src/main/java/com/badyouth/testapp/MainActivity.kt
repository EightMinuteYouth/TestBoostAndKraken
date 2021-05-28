package com.badyouth.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.idlefish.flutterboost.containers.BoostFlutterActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = BoostFlutterActivity.withNewEngine().url("testKraken")
                .backgroundMode(BoostFlutterActivity.BackgroundMode.opaque).build(this)
            startActivity(intent)
        }
    }
}