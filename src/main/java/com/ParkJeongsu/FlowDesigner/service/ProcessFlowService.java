package com.ParkJeongsu.FlowDesigner.service;

import com.ParkJeongsu.FlowDesigner.domain.MESFactory;
import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.repository.ProcessFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessFlowService {

    @Autowired
    private ProcessFlowRepository processFlowRepository;

    public List<ProcessFlow> getFlowList(){
        return processFlowRepository.reallAll();
    }
}
