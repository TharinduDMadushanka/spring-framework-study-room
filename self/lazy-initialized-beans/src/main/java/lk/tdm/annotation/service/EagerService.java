package lk.tdm.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class EagerService {
    public EagerService() {
        System.out.println("EagerService is initialized.");
    }

    public void performAction() {
        System.out.println("Action performed by EagerService.");
    }
}

