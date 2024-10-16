package shop.web.homework.web.shop.service;

import org.springframework.stereotype.Service;
import shop.web.homework.web.shop.Basket;

import java.util.List;

@Service
public class BasketServiceIml {

    private final Basket basket;

    public BasketServiceIml(Basket basket) {
        this.basket = basket;
    }

    public void addItems(List<Integer> items) {
        basket.addItems(items);
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }
}
