package com.xoriant.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = { @ComponentScan("com.xoriant.dao"), 
						  @ComponentScan("com.xoriant.service") })
public class RootConfig {

}
