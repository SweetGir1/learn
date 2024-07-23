package com.cw.mapper;

import com.cw.model.AdjustSalary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdjustSalaryMapper {
    int insert(AdjustSalary adjustSalary);

    int insertSelectActive(AdjustSalary adjustSalary);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(AdjustSalary adjustSalary);

    int updateByPrimaryKeySelect(AdjustSalary adjustSalary);

    AdjustSalary selectByPrimaryKey(Integer id);

    List<AdjustSalary> selectAllSalary();


}
