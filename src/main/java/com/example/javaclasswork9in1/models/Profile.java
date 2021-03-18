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

public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private String avatar;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)


    private User user;

    public Profile(String firstname, String lastname, int age, String avatar) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.avatar = avatar;
    }

    public Profile(String firstname, String lastname, int age, String avatar, User user) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.avatar = avatar;
        this.user = user;
    }
}
