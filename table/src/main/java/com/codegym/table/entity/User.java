package com.codegym.table.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String password;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Address> addressList;
    @OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
    private Card card;
}
