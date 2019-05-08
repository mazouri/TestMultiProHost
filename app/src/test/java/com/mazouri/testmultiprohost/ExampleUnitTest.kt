package com.mazouri.testmultiprohost

import com.mazouri.sdk_lib_one.SdkLibOneUtil
import com.mazouri.sdklibtwo.SdkLibTwoUtil
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testLibs() {
        println(SdkLibOneUtil.get())
        println(SdkLibTwoUtil.get())
    }
}
