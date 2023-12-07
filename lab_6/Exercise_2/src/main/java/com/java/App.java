package com.java;



import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = new ClassPathXmlApplicationContext("bean.xml") ;


        ConfigurableBeanFactory beanFactory = (ConfigurableBeanFactory) ct.getAutowireCapableBeanFactory();




        Product ap1 = ct.getBean("product1" , Product.class)  ;
        Product bp1 = ct.getBean("product1" , Product.class)  ;

        Product ap2 = ct.getBean("product3" , Product.class)  ;
        Product bp2 = ct.getBean("product3" , Product.class)  ;
        String scope = beanFactory.getMergedBeanDefinition("product1").getScope();
        System.out.println("Product 1 is a prototype scope :  " + scope.equals("prototype"));
        scope = beanFactory.getMergedBeanDefinition("product2").getScope();
        System.out.println("Product 2 is a prototype scope :  " + scope.equals("prototype"));
        scope = beanFactory.getMergedBeanDefinition("product3").getScope();
        System.out.println("Product 3 is a single scope :  " + scope.equals("singleton"));





    }
}
