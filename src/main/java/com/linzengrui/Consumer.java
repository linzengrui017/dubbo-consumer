package com.linzengrui;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lzr on 2017/4/8.
 */
@Configuration
public class Consumer extends DubboBaseConfig{
    @Bean
    public ReferenceBean<Person> personConsumer() {
        ReferenceBean<Person> ref = new ReferenceBean<>();
        ref.setVersion("myversion");
        ref.setInterface(Person.class);
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
    }

}
