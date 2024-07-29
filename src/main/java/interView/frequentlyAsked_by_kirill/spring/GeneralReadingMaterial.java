package interView.frequentlyAsked_by_kirill.spring;

import org.junit.jupiter.api.Test;

public class GeneralReadingMaterial {
    public static void main(String[] args) {
        GeneralReadingMaterial g = new GeneralReadingMaterial();
        g.beanlifecycle();
        g.springLifeCycle();
        g.beanScopes();
        g.springBootStarters();
        g.generalInfo();
    }

    private void beanScopes() {
        //singleton, prototype, request, session
        //TODO https://howtodoinjava.com/spring-core/spring-bean-scopes/
    }

    private void beanlifecycle() {
        // TODO https://howtodoinjava.com/spring-core/spring-bean-life-cycle/
    }

    public void springLifeCycle(){
        //TODO https://habr.com/ru/articles/720794/
        inversionOfControl();
    }

    public void springBootStarters(){
        //mailers JPA, WEB, etc
        //TODO https://www.baeldung.com/spring-boot-starters
    }

    public void generalInfo(){
        //TODO https://habr.com/ru/companies/otus/articles/588378/
        //TODO https://www.baeldung.com/spring-interview-questions#Q10
    }

    public void inversionOfControl(){
        /*
        Inversion of Control is a key part of what makes a framework different to a library.
        A library is essentially a set of functions that you can call, these days usually
        organized into classes. Each call does some work and returns control to the client.

        A framework embodies some abstract design, with more behavior built in. In order to use
        it you need to insert your behavior into various places in the framework either by
         subclassing or by plugging in your own classes. The framework's code then calls your code at these points.
         */
        //TODO https://martinfowler.com/bliki/InversionOfControl.html
    }

    void whatIsABean(){
        //In essence, a Spring bean is simply a Java object managed by the Spring IoC container.

        /*
            Object Management: Normally in Java, you create objects using new ClassName() whenever you need them. With Spring, you tell Spring to manage these objects for you.

Configuration: You configure these objects (beans) in an XML file or Java annotations. This configuration tells Spring what objects to create, how they should be created, and how they should be connected to each other.

Dependency Injection: One of the key features of Spring is dependency injection. It means Spring will inject the dependencies (other beans) into your bean when it creates it. This helps in making your code modular and easier to test.

Lifecycle Management: Spring can manage the lifecycle of beans, which means it can create them, call their initialization methods, and clean them up when they are no longer needed.
         */
    }
}
