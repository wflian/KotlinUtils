package com.lwf.utils.kotlin

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo


/**
 * 连武凤 2019/4/22 15:02:24
 *
 */

/**
 * 获取网络信息
 * @receiver Context
 * @return NetworkInfo?
 */
fun Context.getNetworkInfo(): NetworkInfo? {
    return try {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        cm.activeNetworkInfo as NetworkInfo
    } catch (e: Exception) {
        null
    }

}

/**
 * 网络是否可用
 * @receiver Context
 * @return Boolean
 */
fun Context.netAvailable() = getNetworkInfo()?.isAvailable ?: false

/**
 * 是否是WiFi
 * @receiver Context
 * @return Boolean
 */
fun Context.netIsWifi() = getNetworkInfo()?.type ?: -1 == ConnectivityManager.TYPE_WIFI

/**
 * 是否是手机网络
 * @receiver Context
 * @return Boolean
 */
fun Context.netIsMobile() = getNetworkInfo()?.type ?: -1 == ConnectivityManager.TYPE_MOBILE
