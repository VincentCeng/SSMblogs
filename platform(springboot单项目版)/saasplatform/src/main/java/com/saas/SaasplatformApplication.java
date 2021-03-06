package com.saas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication()
// 支持定时任务注解,否则无法启动定时任务
@EnableScheduling
@MapperScan("com.saas.admin.mapper")
@EnableRedisHttpSession
public class SaasplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaasplatformApplication.class, args);
	}
}
