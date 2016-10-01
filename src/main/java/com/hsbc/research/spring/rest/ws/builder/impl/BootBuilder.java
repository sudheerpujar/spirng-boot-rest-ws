package com.hsbc.research.spring.rest.ws.builder.impl;

import com.hsbc.research.spring.rest.ws.beans.Boot;
import com.hsbc.research.spring.rest.ws.builder.Builder;

import java.util.Date;

/**
 * Created by sudhe on 29-08-2016.
 */
public class BootBuilder implements Builder {


    private int id;
    private String name;
    private Date date;
    private float amount;


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

    public BootBuilder id(int id){
        this.id=id;
        return this;
    }

    public BootBuilder name(String name){
        this.name=name;
        return this;
    }

    public BootBuilder date(Date date){
        this.date=date;
        return this;
    }

    public BootBuilder amount(float amount){
        this.amount=amount;
        return this;
    }

    @Override
    public Boot build() {
        return new Boot(this);
    }
}
