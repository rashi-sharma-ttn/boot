package com.springSecurity.springSecurity.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{

    private static final String RESOURCE_ID = "CouponService";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        System.out.println("Resource Server Security Configurer");
        resources.resourceId(RESOURCE_ID);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        System.out.println("Http Security");
        http.authorizeRequests().mvcMatchers(HttpMethod.GET,"/couponapi/coupons/{code:^[A-Z]*$}").hasAnyRole("USER","ADMIN")
                .mvcMatchers(HttpMethod.POST,"/couponapi/coupons").hasRole("ADMIN").and().csrf().and().cors().disable();
    }
}