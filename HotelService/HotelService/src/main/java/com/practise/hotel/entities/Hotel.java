package com.practise.hotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Hotels")
public class Hotel {
    @Id
    private String id;

    private String name;
    private String location;
    private String about;
}
