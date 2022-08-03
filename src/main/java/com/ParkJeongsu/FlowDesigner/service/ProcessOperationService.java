package com.ParkJeongsu.FlowDesigner.service;

import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.domain.ProcessOperation;
import com.ParkJeongsu.FlowDesigner.repository.ProcessFlowRepository;
import com.ParkJeongsu.FlowDesigner.repository.ProcessOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessOperationService {

    @Autowired
    private ProcessOperationRepository processOperationRepository;

    public List<ProcessOperation> getOperationList(){
        return processOperationRepository.reallAll();
    }
}
