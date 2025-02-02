package com.example.SCM.Project.Entitites;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
    @Id
    private String contactId;
    private String email;
    private String phone;
    private String description;
    private String address;
    private String name;
    private boolean favorite;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER)  
    private List<SocialLinks> socialLinks= new ArrayList<>();
}
