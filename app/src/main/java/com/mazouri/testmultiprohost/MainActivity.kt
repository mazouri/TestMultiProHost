package com.mazouri.testmultiprohost

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mazouri.sdk_lib_one.SdkLibOneUtil
import com.mazouri.sdklibtwo.SdkLibTwoUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SdkLibOneUtil.get();
        SdkLibTwoUtil.get();
    }
}
