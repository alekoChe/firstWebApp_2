import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Product { //////////////////////////////////////////////////

    private int id;
    private String title;
    private Double cost;
    List<Product> priceList = new ArrayList<>();

    public Product(int id, String title, Double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
    public Product() {}

    protected void addItemInPriceList(int id, String title, Double cost) {
        Product product = new Product(id, title, cost);
        priceList.add(product);
    }

    protected void fillingPriceList() {
        addItemInPriceList(1, "aaa", 1.0);
        addItemInPriceList(2, "sss", 2.0);
        addItemInPriceList(3, "ddd", 3.0);
        addItemInPriceList(4, "fff", 4.0);
        addItemInPriceList(5, "zzz", 5.0);
        addItemInPriceList(6, "xxx", 6.0);
        addItemInPriceList(7, "ccc", 7.0);
        addItemInPriceList(8, "ggg", 8.0);
        addItemInPriceList(9, "vvv", 9.0);
        addItemInPriceList(10, "qqq", 10.0);
        addItemInPriceList(11, "www", 11.0);
    }
}
