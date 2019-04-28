package com.lwf.utils.kotlin

import android.content.Context

/**
 * 连武凤 2019/4/22 16:49:07
 *  获取设备信息的工具类
 */

/**
 * 是否有摄像头
 * @receiver Context
 * @return Boolean
 */
fun Context.hasCamera() =
    packageManager.hasSystemFeature("android.hardware.camera.front") || packageManager.hasSystemFeature("android.hardware.camera")


