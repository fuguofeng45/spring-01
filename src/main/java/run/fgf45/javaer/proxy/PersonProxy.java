package run.fgf45.javaer.proxy;

import run.fgf45.javaer.entity.IPerson;
import run.fgf45.javaer.entity.impl.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonProxy {

    IPerson person = new Person();

    public IPerson getProxy(){

        return (IPerson) Proxy.newProxyInstance(Person.class.getClassLoader(), person.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("sing")) {

                    System.out.println("给1000万来再唱");

                    //实际上唱歌的还是小明
                    method.invoke(person, args);
                }
                return null;
            }
        });

    }

}
