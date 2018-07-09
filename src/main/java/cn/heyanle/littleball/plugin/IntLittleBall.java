package cn.heyanle.littleball.plugin;

import android.content.Context;
import cn.heyanle.littleball.plugin.data.Face;

public interface IntLittleBall {

    void addFace(Face face);

    void clearNowShowFace();

    void clearAllFace();

    Context getContext();

}