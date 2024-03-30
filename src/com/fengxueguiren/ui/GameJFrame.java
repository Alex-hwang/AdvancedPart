package com.fengxueguiren.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //界面、窗口
    //规定这个是游戏的主界面，和游戏相关的都写在这里面
    public GameJFrame() {
        extracted();
        JMenuBar jMenuBar = getjMenuBar();
        //将菜单栏添加到窗口中
        this.setJMenuBar(jMenuBar);
        //初始化图片
        initImage();


        //设置窗口可见
        this.setVisible(true);
    }

    private static JMenuBar getjMenuBar() {
        //初始化菜单
        //创建菜单栏
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单
        JMenu FunctionJMenu = new JMenu("功能");
        JMenu AboutJMenu = new JMenu("关于");
        JMenu OtherJMenu = new JMenu("其他");
        //创建菜单项
        JMenuItem RestartItem = new JMenuItem("重新开始");
        JMenuItem ExitItem = new JMenuItem("退出游戏");
        JMenuItem ReloginItem = new JMenuItem("重新登录");
        JMenuItem HelpItem = new JMenuItem("帮助");
        JMenuItem AboutItem = new JMenuItem("关于我们");
        JMenuItem OtherItem = new JMenuItem("别点");

        //将菜单项添加到菜单中
        FunctionJMenu.add(RestartItem);
        FunctionJMenu.add(ReloginItem);
        FunctionJMenu.add(ExitItem);
        AboutJMenu.add(HelpItem);
        AboutJMenu.add(AboutItem);
        OtherJMenu.add(OtherItem);

        //将菜单添加到菜单栏中
        jMenuBar.add(FunctionJMenu);
        jMenuBar.add(AboutJMenu);
        jMenuBar.add(OtherJMenu);
        return jMenuBar;
    }

    private void initImage() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //计算图片的编号
                int number = i * 4 + j + 1;
                //创建一个对象
                //创建一个标签
                JLabel jLabel = new JLabel(new ImageIcon(STR."D:\\java\\Java\\AdvancedPart\\src\\com\\i\\image\\animal\\animal3\\\{number}.jpg"));
                //指定图片的位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                //把标签添加到窗口中
                this.getContentPane().add(jLabel);
            }
        }
    }

    private void extracted() {
        //设置窗口的大小
        this.setSize(420, 480);
        //设置窗口的标题
        this.setTitle("风雪归人拼图游戏1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中方式
        this.setLayout(null);
        //设置窗口的图标
        this.setIconImage(new ImageIcon("src/com/i/image/icon.jpg").getImage());
    }
}
