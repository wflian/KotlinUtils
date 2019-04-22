package com.lwf.utils.kotlin

import android.content.Context

/**
 * 连武凤 2019/4/22 10:42:02
 * SharedPreferences 相关操作工具类
 */
object SPUtils {

    /**
     *
     * @receiver Context
     * @param name String
     * @param key String
     * @param value Any
     * @return Function0<Boolean>
     */
    fun Context.put(name: String, key: String, value: Any): Boolean {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        val edit = sp.edit()

        when (value) {
            is Int -> edit.putInt(key, value)
            is String -> edit.putString(key, value)
            is Long -> edit.putLong(key, value)
            is Float -> edit.putFloat(key, value)
            is Boolean -> edit.putBoolean(key, value)
            else -> throw IllegalArgumentException("不支持该类型的数据")
        }
        return edit.commit()
    }

    /**
     *
     * @receiver Context
     * @param name String
     * @param key String
     * @param value Set<String>
     * @return Boolean
     */
    fun Context.putSet(name: String, key: String, value: Set<String>): Boolean {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        val edit = sp.edit()
        edit.putStringSet(key, value)
        return edit.commit()
    }


    fun Context.getInt(name: String, key: String, defaultValue: Int) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getInt(key, defaultValue)
    }

    fun Context.getString(name: String, key: String, defaultValue: String) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getString(key, defaultValue)
    }

    fun Context.getBoolean(name: String, key: String, defaultValue: Boolean) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getBoolean(key, defaultValue)
    }

    fun Context.getFloat(name: String, key: String, defaultValue: Float) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getFloat(key, defaultValue)
    }

    fun Context.getLong(name: String, key: String, defaultValue: Long) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getLong(key, defaultValue)
    }

    fun Context.getStringSet(name: String, key: String, defaultValue: Set<String>) = {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        sp.getStringSet(key, defaultValue)
    }

    fun Context.remomveKey(name: String, key: String): Boolean {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        val edit = sp.edit()
        edit.remove(key)
        return edit.commit()
    }

    fun Context.clear(name: String): Boolean {
        val sp = getSharedPreferences(name, Context.MODE_PRIVATE)
        val edit = sp.edit()
        edit.clear()
        return edit.commit()
    }


}




