package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName IManager
 * @Description: TODO
 * @Author true
 * @Date 2020/5/2
 * @Version V1.0
 **/
public class IManager extends IUser{


    public IManager(String name,int money){
        super(name,money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int money = super.getMoney();
        System.out.println(this.money);
        if(totalmoney > money){
            System.out.println("余额不足");
            return list;
        }
        this.money -= totalmoney;
        int salary = 0;
        for(int i=0;i<count;i++){
            if(i==count-1){
                list.add(totalmoney);
            }else{
                salary =new Random().nextInt(totalmoney);
                list.add(salary);
                totalmoney -= salary;
            }
        }
        return list;
    }

}
