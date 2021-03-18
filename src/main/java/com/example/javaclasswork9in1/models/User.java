package com.example.javaclasswork9in1.models;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mail;
    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    @JoinColumn(name = "user_id")
    private Profile profile;


    public User(String mail, String password, Profile profile) {
        this.mail = mail;
        this.password = password;
        this.profile = profile;
    }

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }
}
