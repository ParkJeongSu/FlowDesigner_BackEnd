package com.ParkJeongsu.FlowDesigner.repository;

import com.ParkJeongsu.FlowDesigner.domain.ProcessFlow;
import com.ParkJeongsu.FlowDesigner.domain.ProcessOperation;

import java.util.List;

public interface ProcessOperationRepository {

    List<ProcessOperation> reallAll();
}
