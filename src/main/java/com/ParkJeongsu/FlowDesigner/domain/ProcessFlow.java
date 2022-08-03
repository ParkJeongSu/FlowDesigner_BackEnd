package com.ParkJeongsu.FlowDesigner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PROCESSFLOW")
public class ProcessFlow implements Serializable {
    @Id
    @Column(name ="FACTORYNAME")
    private String factoryName;

    @Id
    @Column(name ="PROCESSFLOWNAME")
    private String processFlowName;

    public ProcessFlow() {
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getProcessFlowName() {
        return processFlowName;
    }

    public void setProcessFlowName(String processFlowName) {
        this.processFlowName = processFlowName;
    }
}
