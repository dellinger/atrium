package me.dme.atrium.utility;

import me.dme.atrium.domain.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by david on 9/28/14.
 */
public class ProductBuilder {

    private String defaultId = "123";

    private String defaultName = "default name";

    private String defaultDescription = "This is a default description";

    private double defaultPrice = 12.34;

    private LocalDate defaultDate = LocalDate.now().minusDays(5);

    public Product build(){
        Product product = new Product();
        product.setId(defaultId);
        product.setName(defaultName);
        product.setDescription(defaultDescription);
        product.setPrice(defaultPrice);
        product.setPurchaseDate(defaultDate);
        return product;
    }

    public ProductBuilder withId(String id) {
        this.defaultId = id;
        return this;
    }

    public ProductBuilder withName(String name) {
        this.defaultName = name;
        return this;
    }

    public ProductBuilder withDescription(String description) {
        this.defaultDescription = description;
        return this;
    }

    public ProductBuilder withPurchasedDate(LocalDate date){
        this.defaultDate = date;
        return this;
    }

    public ProductBuilder withPrice(double price){
        this.defaultPrice = price;
        return this;
    }






}
