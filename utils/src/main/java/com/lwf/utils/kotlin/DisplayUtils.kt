package com.lwf.utils

import android.content.Context
import androidx.annotation.DimenRes

/**
 * 连武凤 2019/4/21 11:12:56
 * 显示 相关
 */

/**
 *  dp 转 px
 */
fun Context.dp2px(dpValue: Float): Int = (dpValue * resources.displayMetrics.density + 0.5f).toInt()

/**
 *  px 转 dp
 */
fun Context.px2dp(pxValue: Float): Int = (pxValue / resources.displayMetrics.density + 0.5).toInt()

/**
 *  获取dimen资源文件的px值
 */
fun Context.dimen2px(@DimenRes resource: Int): Int = resources.getDimensionPixelSize(resource)

