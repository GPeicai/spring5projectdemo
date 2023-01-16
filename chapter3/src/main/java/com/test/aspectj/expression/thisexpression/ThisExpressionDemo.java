package com.test.aspectj.expression.thisexpression;

import com.test.aspectj.expression.Factory;
import com.test.aspectj.expression.FoodFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/100
 * @Description 测试
 */
public class ThisExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjthisexpression.xml");
        Object obj = context.getBean("foodFactory");
        Factory foodFactory = (Factory) obj;
        foodFactory.make();
        System.out.println("-----分割线-----");
        Listener listener = (Listener) foodFactory;
        listener.listen();
    }
}
