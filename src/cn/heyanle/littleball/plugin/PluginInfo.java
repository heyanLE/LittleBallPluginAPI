package cn.heyanle.littleball.plugin;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;

public class PluginInfo {

    public String packageName = "";//包名

    public String name = "";//名字
    public String version = "";//版本
    public String describe = "";//描述
    public String entrance = "";//入口
    public String minVersion = "";//最低支持版本

    public Drawable iconDraw = null;//图标

    public ApplicationInfo applicationInfo = null;//applicationInfo对象 可以拿到更多数据
    public PackageInfo packageInfo = null;//PackageInfo对象 同上

}
