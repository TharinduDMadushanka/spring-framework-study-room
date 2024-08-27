package lk.tdm.annotation.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class LazyService {

    public LazyService() {
        System.out.println("LazyService is initialized.");
    }

    public void doSomething() {
        System.out.println("doSomething is called in LazyService.");
    }
}

/**
 * @Lazy: This annotation tells Spring to lazily initialize this bean.
 * It can be used at the class level or on individual beans in a configuration class.
 */