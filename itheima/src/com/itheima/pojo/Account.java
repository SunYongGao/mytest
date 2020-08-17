package com.itheima.pojo;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * @description:
 * @author: 孙勇高
 * @date: 2020/7/30 20:16
 */
public class Account implements Serializable {
    private String shiYi;
    private Integer money;
    private String way;
    private Data data;

    @Override
    public String toString() {
        return "Account{" +
                "shiYi='" + shiYi + '\'' +
                ", money=" + money +
                ", way='" + way + '\'' +
                ", data=" + data +
                '}';
    }

    public String getShiYi() {
        return shiYi;
    }

    public void setShiYi(String shiYi) {
        this.shiYi = shiYi;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
