package com.ydy.weidong.ormlite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "charge")
public class Charge {
    @DatabaseField(useGetSet = true, generatedId = true, columnName = "id")
    Long id;
    @DatabaseField(useGetSet = true, columnName = "c_time")
    String time;
    @DatabaseField(useGetSet = true, columnName = "c_money")
    Float money;

    public Charge() {
    }

    public Charge(Long id, String time, Float money) {
        this.id = id;
        this.time = time;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", money=" + money +
                '}';
    }
}
