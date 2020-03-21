package com.shengdong;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试函数入口
public class MainApp {
    public static void main(String[] args) {
//        try {
        @SuppressWarnings("resource")
        // ApplicationContext继承自BeanFactory,ClassPathXmlApplicationContext继承自ApplicationContext
                ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ListTestBean listBean = context.getBean("listBean", ListTestBean.class);
        System.out.println(listBean.getValues());
        CollectionTestBean setBean = context.getBean("setBean", CollectionTestBean.class);
        System.out.println(setBean.getValues());

        //通过构造器方式注入
        HelloApiDecorator bean1 = (HelloApiDecorator)context.getBean("bean1");
        bean1.sayHello();

        //通过setter方式注入
        HelloApiDecorator bean2 = (HelloApiDecorator)context.getBean("bean2");
        bean2.sayHello();

//        } catch (Exception e) {
//            //因为要在创建circle3时抛出；
//            Throwable e1 = e.getCause().getCause().getCause();
//        }
    }
}
