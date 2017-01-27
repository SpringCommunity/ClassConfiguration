package springcommunity.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/* 
 * Annotation configuration chỉ cho Spring biết đây là class chứa các thông tin về cấu hình 
 * ComonentScan sẽ chỉ cho Spring biết đó là base package của ứng dụng
 * */
@Configuration
@ComponentScan("springcommunity.demo")
public class AppConfiguration 
{
/* Cấu hình cho view, các file view sẽ có định dạng là jsp và nằm trong thư mục views */
   @Bean
   public InternalResourceViewResolver internalResourceViewResolver(){
	   InternalResourceViewResolver view = new InternalResourceViewResolver();
	   view.setPrefix("/WEB-INF/views/");
	   view.setSuffix(".jsp");
	   return view;
   }
/* Cấu hình cho text encoding*/
   @Bean
   public ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource(){
	   ReloadableResourceBundleMessageSource message = new ReloadableResourceBundleMessageSource();
	   message.setDefaultEncoding("UTF-8");
	   return message;
   }
  
   
}
