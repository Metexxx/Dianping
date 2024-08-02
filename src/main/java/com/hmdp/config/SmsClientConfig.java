package com.hmdp.config;

import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 榛子云短信配置类
 *
 */

@Configuration
public class SmsClientConfig {
    @Bean
    public ZhenziSmsClient zhenziSmsClient() {
        String apiUrl = "https://sms_developer.zhenzikj.com";
        String appId = "114002";
        String appSecret = "63bd2f35-e450-47a4-8cf0-46f4a8af9f85";
        return new ZhenziSmsClient(apiUrl, appId, appSecret);
    }
}
