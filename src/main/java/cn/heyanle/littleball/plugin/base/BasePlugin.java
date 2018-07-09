package cn.heyanle.littleball.plugin.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import cn.heyanle.littleball.plugin.listener.AccessibilityListener;
import cn.heyanle.littleball.plugin.listener.NotificationListener;

public abstract class BasePlugin {

    private String packageName;
    private String name;
    private String version;
    private String describe;
    private String entrance;
    private Float minVersion;
    private Drawable iconDraw;
    private ApplicationInfo applicationInfo;

    private Context masterContext;
    private Context pluginContext;
    private Resources resources;
    private NotificationListener notificationListener;
    private AccessibilityListener accessibilityListener;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public Float getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Float minVersion) {
        this.minVersion = minVersion;
    }

    public Drawable getIconDraw() {
        return iconDraw;
    }

    public void setIconDraw(Drawable iconDraw) {
        this.iconDraw = iconDraw;
    }

    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public Context getMasterContext() {
        return masterContext;
    }

    public void setMasterContext(Context masterContext) {
        this.masterContext = masterContext;
    }

    public Context getPluginContext() {
        return pluginContext;
    }

    public void setPluginContext(Context pluginContext) {
        this.pluginContext = pluginContext;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public AccessibilityListener getAccessibilityListener() {
        return accessibilityListener;
    }

    public void setAccessibilityListener(AccessibilityListener accessibilityListener) {
        this.accessibilityListener = accessibilityListener;
    }

    public NotificationListener getNotificationListener() {
        return notificationListener;
    }

    public void setNotificationListener(NotificationListener notificationListener) {
        this.notificationListener = notificationListener;
    }

}