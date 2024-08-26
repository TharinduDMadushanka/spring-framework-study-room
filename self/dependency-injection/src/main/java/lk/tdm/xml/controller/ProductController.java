package lk.tdm.xml.controller;


import lk.tdm.xml.service.ProductService;

public class ProductController {

    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void processSave(){
        productService.saveProduct();
        System.out.println("Product saved.!");
    }
}
