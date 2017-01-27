package springcommunity.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/* 
 * Annotation configuration chỉ cho Spring biết đây là class chứa các thông tin về cấu hình
 * Annotation EnablWebMvc giúp Spring hiểu ứng dụng sẽ được phân tầng theo mô hình Model-View-Controller
 * ComonentScan sẽ chỉ cho Spring biết đó là base package của ứng dụng
 * */
@Configuration
@EnableWebMvc
@ComponentScan("springcommunity.demo")
public class AppConfiguration extends WebMvcConfigurerAdapter{
	/*
	 * Cấu hình cho view, các file view sẽ có định dạng là jsp và nằm trong thư
	 * mục views
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/views/");
		view.setSuffix(".jsp");
		return view;
	}

	/* Cấu hình cho text encoding */
	@Bean
	public ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource() {
		ReloadableResourceBundleMessageSource message = new ReloadableResourceBundleMessageSource();
		message.setDefaultEncoding("UTF-8");
		return message;
	}
    /* Spring sẽ scan các file js, css, img nằm trong thư mục resources */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources");
	}

}
