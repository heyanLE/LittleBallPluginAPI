package cn.heyanle.littleball.plugin.listener;

import android.service.notification.StatusBarNotification;

/**
 * 通知监听器接口
 */
public interface NotificationListener {
    void onNotificationPosted(StatusBarNotification sbn) ;
    void onNotificationRemoved(StatusBarNotification sbn) ;
}
