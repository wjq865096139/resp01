package cn.itcast.day09.demo14;

import java.util.ArrayList;

/**
 * @ClassName IMember
 * @Description: TODO
 * @Author true
 * @Date 2020/5/2
 * @Version V1.0
 **/
public class IMember extends IUser {
    public IMember(String name,int money) {
        super(name,money);
    }

    public void get(ArrayList<Integer> list){
        super.setMoney(list.remove(0));
    }

}
