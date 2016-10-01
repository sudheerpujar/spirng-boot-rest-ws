package com.hsbc.research.spring.rest.ws.beans;

import com.hsbc.research.spring.rest.ws.builder.impl.BootBuilder;

import java.util.Date;

/**
 * Created by sudhe on 29-08-2016.
 */
public class Boot{
    private final int id;
    private final String name;
    private final Date date;
    private final float amount;

    public Boot(BootBuilder bootBuilder){
        id=bootBuilder.getId();
        name=bootBuilder.getName();
        date=bootBuilder.getDate();
        amount=bootBuilder.getAmount();
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
        if (!(o instanceof Boot)) return false;

        Boot boot = (Boot) o;

        if (getId() != boot.getId()) return false;
        if (Float.compare(boot.getAmount(), getAmount()) != 0) return false;
        if (!getName().equals(boot.getName())) return false;
        return getDate().equals(boot.getDate());

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
        return "Boot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }


}
