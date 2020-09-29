package com.rh.code.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

/**
 * 创建cron定时任务
 * spring环境
 * 可以直接手动注入spring_bean, 还可以直接用@Bean创建对象
 */
@Component
public class Spring_CronJob {

    @Autowired
    private AutowireCapableBeanFactory beanFactory;

    /**
     * 添加定时任务方法
     */
    public void register() throws Exception {
        MyJob job = new MyJob();

        MethodInvokingJobDetailFactoryBean mijdfb = new MethodInvokingJobDetailFactoryBean();
        mijdfb.setTargetObject(job);
        mijdfb.setTargetMethod("execute");
        beanFactory.autowireBean(mijdfb); // 向对象手动注入依赖
        mijdfb.afterPropertiesSet(); // 手动执行对象里定义的后置方法逻辑

        CronTriggerFactoryBean ctfb = new CronTriggerFactoryBean();
        ctfb.setJobDetail(mijdfb.getObject());
        ctfb.setCronExpression(MyJob.cron_expression); // 一小时执行一次
        beanFactory.autowireBean(ctfb);
        ctfb.afterPropertiesSet();

        SchedulerFactoryBean sfb = new SchedulerFactoryBean();
        sfb.setTriggers(ctfb.getObject());
    }

    /**
     * 定时任务业务类
     */
    private class MyJob {
        /**
         * 定时任务执行时间,cron表达式
         */
        private static final String cron_expression = "0 0 */1 * * ?";
        /**
         * 业务逻辑方法
         */
        public void execute() {
            System.out.println("执行[Spring_CronJob]定时任务 ok");
        }
    }

}
