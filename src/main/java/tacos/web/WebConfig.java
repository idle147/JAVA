package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    // addViewController()方法可以添加一个简单的视图控制器，它将请求映射到一个固定的视图。
    // addRedirectViewController()方法可以添加一个重定向视图控制器，它将请求重定向到另一个URL。
    // addStatusController()方法可以添加一个状态码视图控制器，它将请求映射到一个指定的HTTP状态码。
    registry.addViewController("/").setViewName("home");
  }

}
