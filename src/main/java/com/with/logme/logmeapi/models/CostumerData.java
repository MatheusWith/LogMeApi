package com.with.logme.logmeapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "costumer_datas")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class CostumerData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String email;
    private int age;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
