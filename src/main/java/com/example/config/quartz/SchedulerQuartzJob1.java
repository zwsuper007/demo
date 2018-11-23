package com.example.config.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Auther: wei.zhao
 * @Date: Create in  2018/10/31 14:45
 * @Description:
 * @Modified By:
 */
@Slf4j
public class SchedulerQuartzJob1 implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("=====>>>>>SchedulerQuartzJob1",System.currentTimeMillis());
    }
}
