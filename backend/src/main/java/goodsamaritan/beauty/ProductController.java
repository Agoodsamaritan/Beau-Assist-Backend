package goodsamaritan.beauty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<List<Product>>(productService.allProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getSingleProduct(@PathVariable int id) {
        return new ResponseEntity<Optional<Product>>(productService.singleProduct(id), HttpStatus.OK);
    }

}
