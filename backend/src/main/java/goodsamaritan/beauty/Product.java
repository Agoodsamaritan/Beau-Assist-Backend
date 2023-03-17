package goodsamaritan.beauty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "beauty")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int id;
    private String brand;
    private String name;
    private String price;
    private String image_link;
    private String description;
    @Field("product_type")
    private String productType;
    private List<String> product_colors;
    private List<String> tag_list;
}
