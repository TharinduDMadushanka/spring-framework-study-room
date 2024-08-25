package lk.tdm.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void serve(){
        System.out.println("Customer Service is serving...");
    }
}

/**
 * @Service: This annotation tells Spring that CustomerService is a service component and should be managed by the IoC Container.
 */