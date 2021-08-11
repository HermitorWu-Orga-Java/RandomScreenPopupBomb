// https://blog.csdn.net/qq_40526907/article/details/104610837

import javax.swing.*;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int n = 0;

        Random rd = new Random();

        while (n < 500) {// 可以任意修改為了達到效果測試時可以改為n>=0
            //或者不需要變量，直接死循環

            JFrame frame = new JFrame("你的電腦已經中毒了，來自chara的嘲諷。");

            frame.setSize(400, 100);
            frame.setLocation(rd.nextInt(1920), rd.nextInt(1080));
            frame.setVisible(true);

            n++;
        }
    }
}
