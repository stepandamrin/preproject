package springCrud.config;


import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

  // Метод, указывающий на класс конфигурации
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{
        WebConfig.class
    };
  }

  // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[]{
        WebConfig.class
    };
  }


  /* Данный метод указывает url, на котором будет базироваться приложение */
  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

  //filter for setup UTF-8
  @Override
  protected Filter[] getServletFilters() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding("UTF-8");
    return new Filter[]{characterEncodingFilter};
  }


}