package cn.itcast.day09.demo14;

import java.util.ArrayList;

/**
 * @ClassName S
 * @Description: TODO
 * @Author true
 * @Date 2020/5/3
 * @Version V1.0
 **/
public class S {

    public static void main(String[] args) {

        IManager iManager = new IManager("群主",100);
        IMember iUser1 = new IMember("成员A",0);
        IMember iUser2 = new IMember("成员B",0);
        IMember iUser3 = new IMember("成员C",0);
        iManager.show();
        iUser1.show();
        iUser2.show();
        iUser3.show();

        ArrayList<Integer> send = iManager.send(30, 3);
        iUser1.get(send);
        iUser2.get(send);
        iUser3.get(send);
        System.out.println("===");
        iManager.show();
        iUser1.show();
        iUser2.show();
        iUser3.show();

    }

}
