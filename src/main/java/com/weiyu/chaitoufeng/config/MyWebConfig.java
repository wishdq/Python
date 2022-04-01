package com.weiyu.chaitoufeng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.firewall.StrictHttpFirewall;


/**
 * Description: 网站配置类
 * Since: 2022-03-25 10:28
 * Author: wish_dq
 */
@Configuration
public class MyWebConfig {


    @Bean
    public StrictHttpFirewall allowUrlEncodedSlashHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        //此处可添加别的规则,目前只设置 允许双 //
        firewall.setAllowUrlEncodedDoubleSlash(true);
        return firewall;
    }

//
//    /**
//     * 文件上传配置
//     */
//    //@Bean
//    //public MultipartConfigElement multipartConfigElement() {
//    //    MultipartConfigFactory factory = new MultipartConfigFactory();
//    //    // 单个数据大小
//    //    factory.setMaxFileSize(DataSize.parse("30MB")); // KB,MB
//    //    //总上传数据大小
//    //    factory.setMaxRequestSize(DataSize.parse("100MB"));
//    //    return factory.createMultipartConfig();
//    //}
//
}
