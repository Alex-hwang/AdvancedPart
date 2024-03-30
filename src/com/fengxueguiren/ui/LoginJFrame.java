package com.fengxueguiren.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //界面、窗口
    //规定这个是登录界面，和登录相关的都写在这里面
    public LoginJFrame() {
        this.setSize(488, 500);
        this.setVisible(true);
        //设置窗口的标题
        this.setTitle("拼图游戏 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(3);
    }
}
