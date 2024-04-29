package com.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Entity
@Data
@Table(name = "notes")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @ManyToOne
    private Group group;

    @ManyToOne
    private User creator;

    private Date createdAt;

    private String title;

    private String content;
}