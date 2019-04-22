package com.lwf.utils

import android.content.Context
import androidx.annotation.DimenRes

/**
 * 连武凤 2019/4/21 11:12:56
 * 屏幕相关的工具类
 */
object DisplayUtils {

    /**
     * dp 转 px
     * @receiver Context
     * @param dpValue Float
     * @return Int
     */
    fun Context.dp2px(dpValue: Float): Int = (dpValue * resources.displayMetrics.density + 0.5f).toInt()

    /**
     * px 转 dp
     * @receiver Context
     * @param pxValue Float
     * @return Int
     */
    fun Context.px2dp(pxValue: Float): Int = (pxValue / resources.displayMetrics.density + 0.5).toInt()


    /**
     * 屏幕宽度 px
     * @receiver Context
     * @return Int
     */
    fun Context.getScreenWidthPx() = resources.displayMetrics.widthPixels

    /**
     * 屏幕高度 px
     * @receiver Context
     * @return Int
     */
    fun Context.getScreenHeightPx() = resources.displayMetrics.heightPixels

    /**
     * 屏幕宽度 dp
     * @receiver Context
     * @return Int
     */
    fun Context.getScreenWidthDp() = px2dp(getScreenWidthPx().toFloat())

    /**
     * 屏幕高度 dp
     * @receiver Context
     * @return Int
     */
    fun Context.getScreenHeightDp() = px2dp(getScreenHeightPx().toFloat())

    /**
     * 获取dimen资源文件的px值
     * @receiver Context
     * @param resource Int
     * @return Int
     */
    fun Context.dimenPx(@DimenRes resource: Int) = resources.getDimensionPixelSize(resource)

    /**
     * 获取dimen资源文件的dp值
     * @receiver Context
     * @param resource Int
     * @return Int
     */
    fun Context.dimenDp(@DimenRes resource: Int) = px2dp(dimenPx(resource).toFloat())

}