package com.digipay.inventory.model.consumer;

import com.digipay.inventory.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "consumer")
public class Consumer extends BaseEntity {


    private String name;

    public Consumer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
