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
    public float minVersion = 1.1f;//最低支持版本

    public Drawable iconDraw = null;//图标

    public ApplicationInfo applicationInfo = null;//applicationInfo对象 可以拿到更多数据

    public PluginInfo name(String name){
        this.name = name;
        return this;
    }

    public PluginInfo version(String version){
        this.version = version;
        return this;
    }

    public PluginInfo describe(String describe){
        this.describe = describe;
        return this;
    }

    public PluginInfo entrance(String entrance){
        this.entrance = entrance;
        return this;
    }

    public PluginInfo minVersion(float minVersion){
        this.minVersion = minVersion;
        return this;
    }

    public PluginInfo iconDraw(Drawable drawable){
        this.iconDraw = drawable;
        return this;
    }

    public PluginInfo applicationInfo(ApplicationInfo applicationInfo){
        this.applicationInfo = applicationInfo;
        return this;
    }

}
