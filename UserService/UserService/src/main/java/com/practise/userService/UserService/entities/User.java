package com.practise.userService.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @Column(name="ID")
    private String ID;
    @Column(name = "Name", length = 20)
    private String name;
    @Column(name = "EMail", nullable = false)
    private String Email;
    @Column(name = "About", nullable = true, table = "")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
