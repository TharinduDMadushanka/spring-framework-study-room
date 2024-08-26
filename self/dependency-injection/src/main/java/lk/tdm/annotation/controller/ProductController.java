package lk.tdm.annotation.controller;

import lk.tdm.annotation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void processSave(){
        productService.saveProduct();
        System.out.println("Product saved.!");
    }
}
