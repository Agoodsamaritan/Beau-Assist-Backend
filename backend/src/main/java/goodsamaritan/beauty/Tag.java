package goodsamaritan.beauty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "beauty")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    @Id
    private int id;
    private String tag_list;
}
