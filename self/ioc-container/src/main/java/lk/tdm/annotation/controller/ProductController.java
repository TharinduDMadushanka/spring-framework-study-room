package lk.tdm.annotation.controller;

import lk.tdm.annotation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    public void processSaving(){
        productService.saveProduct();
        System.out.println("Product saved successfully.!");
    }
}

