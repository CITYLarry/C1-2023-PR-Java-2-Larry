package ec.com.students.sofka.api.domain.collection;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@Document(collection = "students")
public class Student {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    @NotNull(message = "Identification number required")
    private String idNum;
    @NotNull(message = "Firstname required")
    private String firstName;
    @NotNull(message = "Lastname required")
    private String lastName;
    private Boolean blocked = false;
    private List<String> books = new ArrayList<>();
}
