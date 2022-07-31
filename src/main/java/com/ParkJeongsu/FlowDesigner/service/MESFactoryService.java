package com.ParkJeongsu.FlowDesigner.service;

import com.ParkJeongsu.FlowDesigner.domain.MESFactory;
import com.ParkJeongsu.FlowDesigner.repository.MESFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MESFactoryService {

    @Autowired
    private MESFactoryRepository mesFactoryRepository;

    public List<MESFactory> getFactoryList(){
        return mesFactoryRepository.reallAll();
    }
}
