package kumar.manav.BookMyShow.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
}
