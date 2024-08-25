package lk.tdm.spring_bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private String prodName;
    private int price;
    private int qoh;

    public Product() {
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }
}
