package shop.web.homework.web.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shop.web.homework.web.shop.service.BasketServiceIml;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketServiceIml basketService;

    public BasketController(BasketServiceIml basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("items") ArrayList<Integer> items) {
        basketService.addItems(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return basketService.getItems();
    }
}
