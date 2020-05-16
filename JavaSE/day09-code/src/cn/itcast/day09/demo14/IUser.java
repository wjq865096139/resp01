package cn.itcast.day09.demo14;

/**
 * @ClassName IUser
 * @Description: TODO
 * @Author true
 * @Date 2020/5/2
 * @Version V1.0
 **/
public class IUser {

    String name;
    int money;

    public IUser(String name,int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void show(){
        System.out.println(this.name+" 余额"+this.money);
    }


}
