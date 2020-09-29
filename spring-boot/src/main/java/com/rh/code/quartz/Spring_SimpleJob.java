package com.rh.code.quartz;

import com.alibaba.fastjson.JSONObject;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.Date;

/**
 * spring设置执行一次的定时任务
 */
public class Spring_SimpleJob {

    public void register() throws Exception {
        // 执行任务参数
        JobDataMap dataMap = new JobDataMap();
        dataMap.put("id", "FAS1D22CD");
        // 任务名，任务组，任务执行类
        JobDetail jobDetail= JobBuilder.newJob(MyJob.class).withIdentity(MyJob.getName(), MyJob.getGroupName()).usingJobData(dataMap).build();

        TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
        // 触发器名,触发器组
        triggerBuilder.withIdentity(MyJob.getName(), MyJob.getGroupName());
        triggerBuilder.startAt(MyJob.getExecuteTime());
        // 触发器时间设定
        triggerBuilder.withSchedule(SimpleScheduleBuilder.simpleSchedule());
        // 创建Trigger对象
        Trigger trigger = triggerBuilder.build();

        SchedulerFactoryBean sfb = new SchedulerFactoryBean();
        Scheduler scheduler = sfb.getScheduler();
        // 添加定时任务
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }

    private static class MyJob implements Job {

        /**
         * 业务方法
         */
        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            System.out.println("执行[Spring_SimpleJob]定时任务, 开始");
            JobDataMap dataMap = context.getJobDetail().getJobDataMap(); // 定时任务执行参数
            System.out.println(JSONObject.toJSONString(dataMap));
            System.out.println("执行[Spring_SimpleJob]定时任务, 结束");
        }

        /**
         * 获得组名
         */
        public static String getGroupName() {
            return "my_job_group";
        }

        /**
         * 获得任务名
         */
        public static String getName() {
            return "my_job";
        }

        /**
         * 获得执行时间
         * 延迟两分钟执行
         */
        public static Date getExecuteTime() {
            return new Date(System.currentTimeMillis() + 1000 * 60 * 2);
        }
    }

}
