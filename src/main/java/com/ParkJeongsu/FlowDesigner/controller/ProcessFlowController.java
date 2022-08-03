package com.ParkJeongsu.FlowDesigner.controller;

import com.ParkJeongsu.FlowDesigner.domain.MESFactory;
import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.service.MESFactoryService;
import com.ParkJeongsu.FlowDesigner.service.ProcessFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ProcessFlowController {

    @Autowired
    private ProcessFlowService processFlowService;

    @GetMapping("flowList")
    @ResponseBody
    public List<ProcessFlow> getFactoryList(){
        return processFlowService.getFlowList();
    }
}
