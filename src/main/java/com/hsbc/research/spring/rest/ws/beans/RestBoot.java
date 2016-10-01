package com.hsbc.research.spring.rest.ws.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sudhe on 30-08-2016.
 */
public class RestBoot {
    private int id;
    private String name;
    private Date date;
    private float amount;

    public RestBoot(){}

    public RestBoot(int id,String name, Date date, float amount
                    ){
        this.id=id;
        this.name=name;
        this.date=date;
        this.amount=amount;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public float getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RestBoot)) return false;

        RestBoot restBoot = (RestBoot) o;

        if (getId() != restBoot.getId()) return false;
        if (Float.compare(restBoot.getAmount(), getAmount()) != 0) return false;
        if (!getName().equals(restBoot.getName())) return false;
        return getDate().equals(restBoot.getDate());

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDate().hashCode();
        result = 31 * result + (getAmount() != +0.0f ? Float.floatToIntBits(getAmount()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RestBoot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
