package com.lwf.utils

import java.io.File

/**
 * 连武凤 2019/4/20 09:54:29
 * 文件 相关
 */

/**
 * 文件是否存在
 * file 文件
 */
fun exists(file: File?) = file?.exists() ?: false

/**
 * 文件是否存在
 * filePath 文件路径
 */
fun exists(filePath: String?) = exists(File(filePath))

/**
 * 是否是文件
 * file 文件
 */
fun isFile(file: File?) = file?.isFile ?: false

/**
 * 是否是文件
 * filePath 文件路径
 */
fun isFile(filePath: String?) = isFile(File(filePath))

/**
 * 是否是文件夹
 * file 文件
 */
fun isDirectory(file: File?) = file?.isDirectory ?: false

/**
 * 是否是文件夹
 * filePath 文件路径
 */
fun isDirectory(filePath: String?) = isDirectory(File(filePath))
