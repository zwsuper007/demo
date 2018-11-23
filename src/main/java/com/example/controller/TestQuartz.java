package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: wei.zhao
 * @Date: Create in  2018/10/31 13:43
 * @Description:
 * @Modified By:
 */
@Slf4j
@Component
public class TestQuartz extends QuartzJobBean{

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("=====>>>>>使用quartz {}",System.currentTimeMillis());
    }
}
