package com.ParkJeongsu.FlowDesigner.controller;

import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.domain.ProcessOperation;
import com.ParkJeongsu.FlowDesigner.service.ProcessFlowService;
import com.ParkJeongsu.FlowDesigner.service.ProcessOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ProcessOperationController {

    @Autowired
    private ProcessOperationService processOperationService;

    @GetMapping("operationList")
    @ResponseBody
    public List<ProcessOperation> getFactoryList(){
        return processOperationService.getOperationList();
    }
}
