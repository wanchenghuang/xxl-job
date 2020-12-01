package com.xxl.job.executor;

import com.chauncy.base.job.core.EnableXxlJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cheng 2020-11-30 00:38:13
 */
@SpringBootApplication
@EnableXxlJob
@ComponentScan(basePackages = {"com.chauncy.base"})
public class XxlJobApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobApplication.class, args);
	}

}