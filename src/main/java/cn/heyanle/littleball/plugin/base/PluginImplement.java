package cn.heyanle.littleball.plugin.base;

import cn.heyanle.littleball.plugin.IntLittleBall;

public interface PluginImplement {

    void onPluginDestroy();

    void onLoad(IntLittleBall intLittleBall);

    void onWindowClose();

    void onWindowShow();

    void onVisibility(boolean isFirst);

    void onInVisibility();

}