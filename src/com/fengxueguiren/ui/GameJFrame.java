package com.fengxueguiren.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //界面、窗口
    //规定这个是游戏的主界面，和游戏相关的都写在这里面
    public GameJFrame() {
        //设置窗口的大小
        this.setSize(600, 800);
        //设置窗口的标题
        this.setTitle("风雪归人拼图游戏1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //设置窗口可见
        this.setVisible(true);
    }
}
