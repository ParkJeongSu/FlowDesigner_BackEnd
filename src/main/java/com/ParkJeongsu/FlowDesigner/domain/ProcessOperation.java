package com.ParkJeongsu.FlowDesigner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PROCESSOPERATION")
public class ProcessOperation implements Serializable {
    @Id
    @Column(name ="FACTORYNAME")
    private String factoryName;

    @Id
    @Column(name ="PROCESSOPERATIONNAME")
    private String processOperationName;

    public ProcessOperation() {
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getProcessOperationName() {
        return processOperationName;
    }

    public void setProcessOperationName(String processOperationName) {
        this.processOperationName = processOperationName;
    }
}
