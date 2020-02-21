package com.whb.test.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * 规则服务启动入口
 *
 * @author wanghb
 * @since 2020/1/18 09:06
 */
@Configuration
//@ImportResource(locations = {"classpath:applicationContext.xml"})
@Slf4j
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class Provider {
    public static void main(String[] args) {
        new SpringApplicationBuilder().web(WebApplicationType.SERVLET).sources(Provider.class).run(args);
    }
}
