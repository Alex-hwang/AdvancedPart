package com.fengxueguiren.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //界面、窗口
    //规定这个是注册界面，和注册相关的都写在这里面
    public RegisterJFrame() {
        this.setSize(300, 500);
        this.setVisible(true);
        //设置窗口的标题
        this.setTitle("拼图游戏 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(3);
    }
}
