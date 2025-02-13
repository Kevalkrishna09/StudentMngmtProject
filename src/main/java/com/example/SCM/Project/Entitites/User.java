package com.example.SCM.Project.Entitites;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userId;

    @Column(name = "user_name",nullable = false)
    
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    private String about;
    private String profilePic;
    //information
    private boolean enabled;
    private boolean emailVerified;
    private boolean phoneVerified;

    //facebook instagram google
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private Providers provider=Providers.SELF;
    private String providerId;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private List<Contact> contacts= new ArrayList<>();

    
}
