package com.lwf.utils

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

/**
 * 连武凤 2019/4/20 09:54:29
 * 文件 相关
 */
object FileUtils {

    /**
     * 文件是否存在
     * @param file File 文件
     * @return Boolean
     */
    fun exists(file: File) = file.exists()

    /**
     * 文件是否存在
     * @param filePath String 文件路径
     * @return Boolean
     */
    fun exists(filePath: String) = exists(File(filePath))

    /**
     * 删除文件/文件夹(文件夹递归删除)
     * @param file File 文件/文件夹
     * @return Boolean 是否删除成功（文件本身不存在，返回true）
     */
    fun delFile(file: File) = file.deleteRecursively()

    /**
     * 删除文件/文件夹(文件夹递归删除)
     * @param filePath String 文件/文件夹 路径
     * @return Boolean 是否删除成功（文件本身不存在，返回true）
     */
    fun delFile(filePath: String) = delFile(File(filePath))

    /**
     * 是否是文件
     * @param file File 文件
     * @return Boolean
     */
    fun isFile(file: File) = file.isFile

    /**
     * 是否是文件
     * @param filePath String? 文件路径
     * @return Boolean
     */
    fun isFile(filePath: String) = isFile(File(filePath))

    /**
     * 是否是文件夹
     * @param file File 文件
     * @return Boolean
     */
    fun isDir(file: File) = file.isDirectory

    /**
     * 是否是文件夹
     * @param filePath String 文件路径
     * @return Boolean
     */
    fun isDir(filePath: String) = isDir(File(filePath))

    /**
     * 创建文件夹
     * @param file File  文件目录
     * @return Boolean 是否创建成功
     */
    fun createDir(file: File) = if (exists(file)) isDir(file) else file.mkdirs()

    /**
     * 创建文件夹
     * @param filePath String 文件目录路径
     * @return Boolean 是否创建成功
     */
    fun createDir(filePath: String) = createDir(File(filePath))

    /**
     * 创建文件
     * @param file File 文件
     * @return Boolean 是否创建成功
     */
    fun createFile(file: File) =
        if (exists(file)) {
            isFile(file)
        } else {
            if (createDir(file.parentFile)) {
                file.createNewFile()
            } else {
                false
            }
        }


    /**
     * 创建文件
     * @param filePath String? 文件路径
     * @return Boolean 是否创建成功
     */
    fun createFile(filePath: String) = createFile(File(filePath))

    /**
     * 复制文件
     * @param fromFile File 源文件
     * @param toFile File 目标文件
     * @return Boolean 是否复制成功
     */
    fun copyFile(fromFile: File, toFile: File) =
        if (isFile(fromFile) && createDir(toFile.parent)) {
            val fis = FileInputStream(fromFile)
            val fos = FileOutputStream(toFile)
            fis.copyTo(fos)
            fos.flush()
            try {
                fis!!.close()
                fos!!.close()
            } catch (e: IOException) {
            }
            true
        } else {
            false
        }

    /**
     * 复制文件
     * @param fromFilePath String? 源文件目录
     * @param toFilePath String? 目标文件目录
     * @return Boolean 是否复制成功
     */
    fun copyFile(fromFilePath: String, toFilePath: String) = copyFile(File(fromFilePath), File(toFilePath))

}

