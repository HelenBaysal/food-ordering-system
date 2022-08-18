package domain.entity;

import domain.valueobject.Money;
import domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId>{
    private String name;
    private Money price;

    public void updateWithConfirmedNameAndPrice(String name, Money price){
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId,String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId) {
        super.setId(productId);
    }


    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
