package com.EVENT.EVENT.Models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.time.LocalDateTime;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String location;
    private String communityName;
    private LocalDateTime startTime;

    // coordonnés
    @Column(columnDefinition = "geography")
    private Point coordinates;
}
