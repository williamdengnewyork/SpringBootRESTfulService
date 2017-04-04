package rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	/*    
	https://spring.io/guides/gs/securing-web/https://spring.io/guides/gs/securing-web/
	
	The configure(HttpSecurity) method defines which URL paths should be secured and which should not. 
	Specifically, the "/" and "/home" paths are configured to not require any authentication. 
	All other paths must be authenticated.
	*/
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "/getQuote", "/greeting")
			.permitAll().anyRequest().authenticated().and()
		.formLogin()
				.loginPage("/login").permitAll().and()
		.logout().permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ACTRADMIN");
	}
}
