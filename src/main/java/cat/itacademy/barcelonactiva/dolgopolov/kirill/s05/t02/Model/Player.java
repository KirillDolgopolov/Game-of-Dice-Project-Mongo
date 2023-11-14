package cat.itacademy.barcelonactiva.dolgopolov.kirill.s05.t02.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {
    
    @Id
    private String id;

    @Column
    private String name;

    @CreatedDate
    @Field("creation_time")
    private LocalDateTime creationTime;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Game> games;

    public Player(String name) {
        this.name = name;
        this.creationTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }
}


