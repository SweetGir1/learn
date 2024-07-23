package com.cw.service;

import com.cw.mapper.AdjustSalaryMapper;
import com.cw.model.AdjustSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdjustSalaryServiceImpl implements AdjustSalaryService{
    @Autowired
    private AdjustSalaryMapper adjustSalaryMapper;
    @Override
    public List<AdjustSalary> getAllAdjustSalary() {
        return adjustSalaryMapper.selectAllSalary();
    }

}
