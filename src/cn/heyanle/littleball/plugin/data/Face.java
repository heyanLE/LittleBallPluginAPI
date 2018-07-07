package cn.heyanle.littleball.plugin.data;

import android.view.View;

/**
 * Face 通知实体类
 * 插件通过吧Face传给主apk
 * 达到控制小球View的目的
 */
public class Face {

    public static final int TYPE_DURING = 0;//通知类型 要指定显示时间 主app通过队列逐个显示
    public static final int TYPE_NOWSHOW = 1;//正在显示类型 主app通过用户设置优先度决定显示

    private View contentView = null;//主View 显示在小球上的view
    private int type = 0; //类型

    private String msg = ""; //如果是通知类型 将会在通知面板显示 这里为通知字样
    private int during = 1000; //通知类型持续时间 单位毫秒 范围 1000-10000

    boolean isShow = false;

    private Face(){}//隐藏构造方法

    /**
     * 获得对象
     * @param type 类型
     * @return 对象
     */
    public static Face build(int type){
        Face face = new Face();
        face.type = type;
        return face;
    }

    /**
     * 设置View参数
     * @param view View
     * @return 设置后的本身
     */
    public Face setView(View view){
        this.contentView = view;
        return this;
    }

    /**
     * 设置msg参数
     * @param msg msg
     * @return 设置后本身
     */
    public Face setMsg(String msg){
        this.msg = msg;
        return this;
    }

    /**
     * 设置During参数
     * @param during during
     * @return 设置后本身
     */
    public Face setDuring(int during){
        int duringR = during;
        if (duringR < 1000)  duringR = 1000;
        else if (duringR < 10000) duringR = 10000;
        this.during = duringR;
        return this;
    }

    public void updateUi(updateUiRunnable action){
        if (contentView != null){
            contentView.post(new Runnable() {
                @Override
                public void run() {
                    action.updateUi(contentView);
                }
            });
        }
    }

    public int getType() {
        return type;
    }

    public int getDuring() {
        return during;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isShow(){
        return isShow;
    }

    /**
     * 更新ui内部类
     */
    public interface updateUiRunnable{
        /**
         * 要对View进行的操作
         * @param view view对象
         */
        void updateUi(View view);
    }
}
