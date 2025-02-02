package com.example.SCM.Project.Entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SocialLinks {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String link;
    private String title;
    @ManyToOne
    private Contact contact;
}
