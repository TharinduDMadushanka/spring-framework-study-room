package lk.tdm.annotation;

import lk.tdm.annotation.config.AppConfig;
import lk.tdm.annotation.service.EagerService;
import lk.tdm.annotation.service.LazyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Application context loaded.");
        // At this point, LazyService has not been initialized yet.

        // LazyService bean will be initialized only when requested
        // Request the LazyService bean
        LazyService lazyService = context.getBean(LazyService.class);

        // The LazyService bean is initialized at this point
        lazyService.doSomething();

        System.out.println("==============================================");

        // EagerService bean is already initialized at this point
        EagerService eagerService = context.getBean(EagerService.class);
        eagerService.performAction();

    }
}

/**
 * Output -> EagerService is initialized.
             Application context loaded.
             LazyService is initialized.
             doSomething is called in LazyService.
             ==============================================
             Action performed by EagerService.

 */

/**
 * The message "LazyService is initialized." will only appear after the getBean() method is called,
   indicating that the bean is lazily initialized.

 * EagerService bean will be created as soon as the application context is loaded.
 */