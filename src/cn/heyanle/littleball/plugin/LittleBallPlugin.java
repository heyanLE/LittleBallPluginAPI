package cn.heyanle.littleball.plugin;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import cn.heyanle.littleball.plugin.listener.AccessibilityListener;
import cn.heyanle.littleball.plugin.listener.NotificationListener;

public class LittleBallPlugin{



    private Context context; //主体上下文对象
    private NotificationListener notificationListener; //通知监听器
    private AccessibilityListener accessibilityListener;//辅助功能监听器
    private IntLittleBall intLittleBall; //主app接口
    private PluginInfo pluginInfo;//插件信息
    private Resources resources;//资源对象


    //各种set get

    public void registeNotificationListener(NotificationListener notificationListener){
        this.notificationListener = notificationListener;
    }

    public void registeAccessibilityListener(AccessibilityListener accessibilityListener){
        this.accessibilityListener = accessibilityListener;
    }

    public NotificationListener getNotificationListener(){
        return notificationListener;
    }

    public AccessibilityListener getAccessibilityListener() {
        return accessibilityListener;
    }

    public Context getContext(){
        return context;
    }

    public IntLittleBall getIntLittleBall(){
        return intLittleBall;
    }

    public void setPluginInfo(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    public PluginInfo getPluginInfo() {
        return pluginInfo;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    //插件生命周期


    /**
     * 获取根view  在fragment onCreate时候调用
     * 一般不用更改
     * @return RootView
     */
    public FrameLayout getRootView(){
        return new FrameLayout(context);
    }

    /**
     * 获取View 在第一次onVisibility之后调用onVisibility(true)
     * @return 最终要显示在窗口里的view
     */
    public View getView(){
        return null;
    }

    /**
     * 在Service OnDestroy时候调用
     */
    public void onPluginDestroy(){ }

    /**
     * 在OnCreate后加载插件时候调用（可以在这里设置WindowsView对象）
     * @param intLittleBall 主apk接口
     */
    public void onLoad(IntLittleBall intLittleBall){
        context = intLittleBall.getContext();
        this.intLittleBall = intLittleBall;
    }

    /**
     * 当窗口关闭时候调用
     */
    public void onWindowClose(){}

    /**
     * 当窗口显示时候调用
     */
    public void onWindowShow(){}

    /**
     * 当窗口的该插件页面显示的时候（如果窗口显示后默认就是该页面 也会执行）
     * @param isFirst 是否为第一次可见
     */
    public void onVisibility(boolean isFirst){ }

    /**
     * 当窗口的该插件页面不显示的时候（滑到别的页面 如果窗口关闭时候就是该页面 也会执行）
     */
    public void onInVisibility(){}

}
