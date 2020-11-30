package com.xxl.job.executor;

import com.chauncy.cloud.job.core.EnableXxlJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cheng 2020-11-30 00:38:13
 */
@SpringBootApplication
@EnableXxlJob
@ComponentScan(basePackages = {"com.chauncy.cloud"})
public class XxlJobApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobApplication.class, args);
	}

}