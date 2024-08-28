package lk.tdm.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class DatabaseConnection {

    public void connect(){
        System.out.println("1");
        System.out.println("Database connection established.");
    }

    public void disconnect(){
        System.out.println("2");
        System.out.println("Database connection closed.");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("3");
        System.out.println("Custom init method: Preparing resources...");
        connect();
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("4");
        System.out.println("Custom destroy method: Releasing resources...");
        disconnect();
    }
}

/**
 * @PostConstruct:
 * The customInit() method is marked with @PostConstruct, which means it will be called after the bean has been instantiated
 * and dependencies injected. Here, the connect() method is called to establish the database connection.
 *
 * @PreDestroy: The customDestroy() method is marked with @PreDestroy, which means it will be called just before the bean is destroyed.
 * The disconnect() method is called to close the database connection.
 */
