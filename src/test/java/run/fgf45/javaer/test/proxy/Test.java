package run.fgf45.javaer.test.proxy;

import run.fgf45.javaer.proxy.PersonProxy;

public class Test {

    public static void main(String[] args) {
        PersonProxy proxy = new PersonProxy();
        proxy.getProxy().sing();
    }

}
