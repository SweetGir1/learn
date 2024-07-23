package com.cw;

import com.cw.mapper.AdjustSalaryMapper;
import com.cw.model.AdjustSalary;
import com.cw.service.AdjustSalaryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MpTest {
    @Autowired
    private AdjustSalaryService adjustSalaryService;
    @Test
    void MapperTest() {
        List<AdjustSalary> allAdjustSalary = adjustSalaryService.getAllAdjustSalary();
        System.out.println(allAdjustSalary);

    }
}
