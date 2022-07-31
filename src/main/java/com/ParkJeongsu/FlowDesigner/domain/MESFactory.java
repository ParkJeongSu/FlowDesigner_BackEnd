package com.ParkJeongsu.FlowDesigner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MESFactory")
public class MESFactory implements Serializable {
    @Id
    @Column(name ="FACTORYNAME")
    private String factoryName;

    public MESFactory() {
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}
