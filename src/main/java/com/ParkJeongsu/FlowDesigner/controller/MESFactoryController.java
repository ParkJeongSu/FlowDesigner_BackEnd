package com.ParkJeongsu.FlowDesigner.controller;

import com.ParkJeongsu.FlowDesigner.domain.MESFactory;
import com.ParkJeongsu.FlowDesigner.service.MESFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin
public class MESFactoryController {

    @Autowired
    private MESFactoryService mesFactoryService;

    @GetMapping("factoryList")
    @ResponseBody
    public List<MESFactory> getFactoryList(){
        return mesFactoryService.getFactoryList();
    }
}
