package com.example.advanceacademy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30)
    private String firstName;

    private String lastName;

    @Column(unique = true)
    @Schema(description = "The user's email address.", example = "lillyivanova@gmail.com")
    private String email;

    private String password;

    private Date registerDate;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Reservation> reservations;

    private String imageUrl;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_addresses",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "address_id")}
    )
    private Set<Address> userDetails;
}
