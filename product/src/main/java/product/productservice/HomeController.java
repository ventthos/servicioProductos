package product.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/hello-world")
    public String hello(){
        return "Hola spring Boot";
    }

    @GetMapping
    public List<Map<String, Object>> getAllProducts() {
        List<Map<String, Object>> products = new ArrayList<>();

        Map<String, Object> product1 = new HashMap<>();
        product1.put("id", 1);
        product1.put("name", "Laptop Gamer");
        product1.put("price", 15000);
        product1.put("stock", 5);

        Map<String, Object> product2 = new HashMap<>();
        product2.put("id", 2);
        product2.put("name", "Mouse RGB");
        product2.put("price", 500);
        product2.put("stock", 20);

        products.add(product1);
        products.add(product2);

        return products;
    }

    @GetMapping("/{id}")
    public Map<String, Object> getProductById(@PathVariable int id) {
        Map<String, Object> product = new HashMap<>();
        product.put("id", id);
        product.put("name", "Producto Demo");
        product.put("price", 999);
        product.put("stock", 10);

        return product;
    }
}
