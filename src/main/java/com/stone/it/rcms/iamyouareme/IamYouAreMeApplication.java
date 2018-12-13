package com.stone.it.rcms.iamyouareme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

@SpringBootApplication
@MapperScan("com.stone.it.rcms.iamyouareme.**.dao")
public class IamYouAreMeApplication {
	//启动入口
	public static void main(String[] args) {
		SpringApplication.run(IamYouAreMeApplication.class, args);
	}
	// 配置一个对象与json转换的工具  
    @Bean  
    public JacksonJaxbJsonProvider jacksonJaxbJsonProvider() {  
        return new JacksonJaxbJsonProvider();  
    }  
}
