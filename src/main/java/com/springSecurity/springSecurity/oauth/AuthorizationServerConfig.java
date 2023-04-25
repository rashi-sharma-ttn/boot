package com.springSecurity.springSecurity.oauth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    private static final String RESOURCE_ID = "CouponService";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        System.out.println("Authorization Server Endpoints Configurer");
        endpoints.tokenStore(new InMemoryTokenStore()).authenticationManager(authenticationManager).userDetailsService(userDetailsService);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        System.out.println("Client Details Service Configurer");
        clients.inMemory().withClient("couponclientapp").secret(passwordEncoder.encode( "ttn")).authorizedGrantTypes("password","refresh_token").scopes("read","write").resourceIds(RESOURCE_ID);
    }
}