package cn.heyanle.littleball.plugin

import android.content.pm.PackageInfo
import android.os.Environment
import java.io.File

/**
 * 插件的基类<br>
 * 封装插件的重要函数
 *
 * @author KallyDev
 * @since 0.1.0
 */
abstract class PluginBase {

    var packageInfo: PackageInfo? = null

    val name: String
        get() = packageInfo!!.applicationInfo.name

    val packageName: String
        get() = packageInfo!!.packageName

    val versionName: String
        get() = packageInfo!!.versionName

    /**
     * 获取插件文件夹
     *
     * @author KallyDev
     * @since 0.1.0
     */
    val fileDir: File
        get() = File(Environment.getExternalStorageDirectory().toString()
                + "LittleBall/Plugin/$packageName")

}